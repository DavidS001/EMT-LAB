package com.example.emtlab2.service;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.enumerations.Category;

public interface BookService {

    void create(String name, Category category, Long authorId, Integer availableCopies);
}
