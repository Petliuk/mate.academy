package com.example.mate_academy.service;

import com.example.mate_academy.model.Book;

import java.util.List;

public interface BookService {
     List<Book> getAllBooks();
     Book getBookById(Long id);
     Book addBook(Book book);
     Book updateBook(Long id, Book bookDetails);
     void deleteBook(Long id);
}
