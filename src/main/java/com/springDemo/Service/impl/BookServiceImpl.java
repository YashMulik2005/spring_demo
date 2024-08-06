package com.springDemo.Service.impl;

import com.springDemo.Modal.Book;
import com.springDemo.Service.BookService;
import com.springDemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public String saveBook(Book book) {
         this.bookRepository.save(book);
         return "Book saved sucessfully.";
    }

    @Override
    public String updateBook(Book book) {
        return "";
    }

    @Override
    public Book getOne(Integer id) {
        return this.bookRepository.findById(id).get();
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }
}
