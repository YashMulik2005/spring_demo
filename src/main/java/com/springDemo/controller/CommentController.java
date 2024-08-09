package com.springDemo.controller;

import com.springDemo.Modal.Comment;
import com.springDemo.Service.CommentService;
import com.springDemo.response.ResponseHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private static final Logger log = LoggerFactory.getLogger(CommentController.class);
    @Autowired
    CommentService commentService;

    @GetMapping()
    public ResponseEntity<Object>getAll(){
        try {
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK, this.commentService.getAll(), true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse("An error occurred while fetching data.", HttpStatus.INTERNAL_SERVER_ERROR, null, false);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object>getOne(@PathVariable long id){
        try {
            return ResponseHandler.CustomResponse("Data fetched sucessfully.", HttpStatus.OK, this.commentService.getOne(id), true);
        }catch(Exception e){
            return ResponseHandler.CustomResponse("An error occurred while fetching data.", HttpStatus.INTERNAL_SERVER_ERROR, null, false);
        }
    }

    @PostMapping()
    public ResponseEntity<Object>SaveData(Comment comment){
        try {
//            return ResponseHandler.CustomResponse("Data saved sucessfully.", HttpStatus.OK, this.commentService.SaveData(comment), true);
            return ResponseHandler.CustomResponse("Data saved sucessfully.", HttpStatus.OK, comment, true);

        }catch(Exception e){

            return ResponseHandler.CustomResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null, false);
        }
    }
}
