package com.springDemo.repository;

import com.springDemo.Modal.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
