package com.example.mate.service;

import com.example.mate.dto.BookDto;
import com.example.mate.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {

    List<BookDto> getAll();

    BookDto getBookById(Long id);

    BookDto createBook(CreateBookRequestDto bookDto);

}
