package com.example.mate.service;

import com.example.mate.model.Book;
import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book addBook(Book book);
}
