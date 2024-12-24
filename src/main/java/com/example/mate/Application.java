package com.example.mate;

import com.example.mate.model.Book;
import com.example.mate.service.BookService;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class Application {
    private final BookService bookServiceI;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner run(BookService bookService) {
        return args -> {
            Book book = new Book();
            book.setTitle("Spring in Action");
            book.setAuthor("Craig Walls");
            book.setIsbn("9781617294945");
            book.setPrice(BigDecimal.valueOf(45.99));
            book.setDescription("Comprehensive guide to Spring Framework.");
            book.setCoverImage("image_url");
            bookService.addBook(book);

            bookService.getAllBooks().forEach(System.out::println);
        };
    }

}
