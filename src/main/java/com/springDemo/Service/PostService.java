package com.springDemo.Service;

import com.springDemo.Modal.Post;

import java.util.List;

public interface PostService {
    public List<Post> getAll();
    public Post getOne(long id);
    public String saveData(Post post);
}
