package com.springDemo.Service;

import com.springDemo.Modal.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> getAll();
    public Comment getOne(long id);
    public String SaveData(Comment comment);
}
