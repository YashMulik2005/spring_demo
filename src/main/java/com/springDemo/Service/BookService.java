package com.springDemo.Service;


import com.springDemo.Modal.Book;

import java.util.List;

public interface BookService {
    public String saveBook(Book book);
    public String updateBook(Book book);
    public Book getOne(Integer id);
    public List<Book> getAll();
}
