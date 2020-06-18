package org.zajecia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.zajecia.entities.Post;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Query(value = "SELECT * FROM posts",nativeQuery = true)
    List<Post> findAll();
}


