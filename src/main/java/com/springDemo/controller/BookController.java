package com.springDemo.controller;

import com.springDemo.Modal.Book;
import com.springDemo.Service.BookService;
import com.springDemo.response.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")

public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/")
    public ResponseEntity<Object> getBooks(){
        return ResponseHandler.CustomResponse("data fetched sucessfully.", HttpStatus.OK,this.bookService.getAll(),true);
    }

    @PostMapping("/")
    public String saveBook(@RequestBody Book book){
        return this.bookService.saveBook(book);
    }

    @GetMapping("/{id}")
    public Book getOne(@PathVariable Integer id){
        System.out.println(id);
        return this.bookService.getOne(id);
    }
}
