package org.zajecia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zajecia.auth.AuthenticationBean;
import org.zajecia.entities.Post;
import org.zajecia.services.PostService;

import java.util.List;
import java.util.Optional;

@CrossOrigin()
@RestController
public class PostController {
    private PostService postService;

    @Autowired
    public PostController(@Qualifier("postService") PostService postService) {
        this.postService = postService;
    }

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticationBean() {
        return new AuthenticationBean("You are authenticated");
    }

    @GetMapping("/api/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/api/posts/{id}")
    public Post getSpecific(@PathVariable Long id){
        Optional<Post> postOptional = postService.getSpecificPost(id);
        return postOptional.orElse(null);
    }
    @PostMapping("/api/posts")
    public ResponseEntity<Void> createPost(@RequestBody Post post) {
        postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
