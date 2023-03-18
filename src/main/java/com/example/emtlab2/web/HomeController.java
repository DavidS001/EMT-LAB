package com.example.emtlab2.web;

import com.example.emtlab2.dataholder.DataHolder;
import com.example.emtlab2.model.Book;
import com.example.emtlab2.service.AuthorService;
import com.example.emtlab2.service.BookService;
import com.example.emtlab2.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    private final BookService bookService;
    private final CountryService countryService;
    private final AuthorService authorService;
    private final DataHolder dataHolder;

    public HomeController(BookService bookService, CountryService countryService, AuthorService authorService, DataHolder dataHolder) {
        this.bookService = bookService;
        this.countryService = countryService;
        this.authorService = authorService;
        this.dataHolder = dataHolder;
    }

    @GetMapping({"/","/books"})
    public List<Book> findAllBooks(){
        return this.bookService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> deleteById(@PathVariable Long id) {
        this.bookService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
