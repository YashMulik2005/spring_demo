package com.springDemo.controller;

import com.springDemo.Modal.Post;
import com.springDemo.Service.PostService;
import com.springDemo.response.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping()
    public ResponseEntity<Object> getAll() {
        try {
            return ResponseHandler.CustomResponse("Data fetched successfully.", HttpStatus.OK, this.postService.getAll(), true);
        } catch (Exception e) {
            return ResponseHandler.CustomResponse("An error occurred while fetching data.", HttpStatus.INTERNAL_SERVER_ERROR, null, false);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable long id) {
        try {
            return ResponseHandler.CustomResponse("Data fetched successfully.", HttpStatus.OK, this.postService.getOne(id), true);
        } catch (Exception e) {
            return ResponseHandler.CustomResponse("An error occurred while fetching data.", HttpStatus.INTERNAL_SERVER_ERROR, null, false);
        }
    }

    @PostMapping()
    public ResponseEntity<Object> saveData(@RequestBody Post post) {
        try {
            return ResponseHandler.CustomResponse("Data saved successfully.", HttpStatus.OK, this.postService.saveData(post), true);
        } catch (Exception e) {
            return ResponseHandler.CustomResponse("An error occurred while saving data.", HttpStatus.INTERNAL_SERVER_ERROR, null, false);
        }
    }
}
