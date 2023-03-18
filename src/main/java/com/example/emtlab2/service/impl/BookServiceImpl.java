package com.example.emtlab2.service.impl;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.Book;
import com.example.emtlab2.model.enumerations.Category;
import com.example.emtlab2.repository.AuthorRepository;
import com.example.emtlab2.repository.BookRepository;
import com.example.emtlab2.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BookServiceImpl(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void create(String name, Category category, Long authorId, Integer availableCopies) {
        Author author = this.authorRepository.findById(authorId).orElseThrow();
        Book book = new Book(name,category,author,availableCopies);
        this.bookRepository.save(book);
    }
}
