package org.zajecia.services;

import org.zajecia.entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> getAllPosts();
    Optional<Post> getSpecificPost(Long id);
    void createPost(Post post);
}
