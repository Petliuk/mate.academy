package com.example.mate.mapper;

import com.example.mate.config.MapperConfig;
import com.example.mate.dto.BookDto;
import com.example.mate.dto.CreateBookRequestDto;
import com.example.mate.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    Book toEntity(CreateBookRequestDto requestDto);

    BookDto toDto(Book book);
}
