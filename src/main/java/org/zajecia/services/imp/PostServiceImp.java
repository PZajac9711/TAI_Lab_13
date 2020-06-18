package org.zajecia.services.imp;

import org.springframework.stereotype.Service;
import org.zajecia.repository.PostRepository;
import org.zajecia.services.PostService;
import org.zajecia.entities.*;
import java.util.List;
import java.util.Optional;

@Service(value = "postService")
public class PostServiceImp implements PostService {
    private final PostRepository postRepository;

    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> getSpecificPost(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void createPost(Post post) {
        postRepository.save(post);
    }
}
