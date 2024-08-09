package com.springDemo.Service.impl;

import com.springDemo.Modal.Comment;
import com.springDemo.Service.CommentService;
import com.springDemo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public List<Comment> getAll() {
        return this.commentRepository.findAll();
    }

    @Override
    public Comment getOne(long id) {
        return this.commentRepository.findById(id).get();
    }

    @Override
    public String SaveData(Comment comment) {
        this.commentRepository.save(comment);
        return "Data saved Sucessfully.";
    }
}
