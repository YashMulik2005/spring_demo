package com.springDemo.Service.impl;

import com.springDemo.Modal.Post;
import com.springDemo.Service.PostService;
import com.springDemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;
    @Override
    public List<Post> getAll() {
        return this.postRepository.findAll();
    }

    @Override
    public Post getOne(long id) {
        return this.postRepository.findById(id).get();
    }

    @Override
    public String saveData(Post post) {
        this.postRepository.save(post);
        return "Data saved sucessfully";
    }
}
