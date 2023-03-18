package com.example.emtlab2.service.impl;

import com.example.emtlab2.model.Author;
import com.example.emtlab2.model.Country;
import com.example.emtlab2.model.exceptions.NoAuthorIdFoundException;
import com.example.emtlab2.repository.AuthorRepository;
import com.example.emtlab2.repository.CountryRepository;
import com.example.emtlab2.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final CountryRepository countryRepository;
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(CountryRepository countryRepository, AuthorRepository authorRepository) {
        this.countryRepository = countryRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void create(String name, String surname, Long countryId) {
        Country country = this.countryRepository.findById(countryId).orElseThrow(NoAuthorIdFoundException::new);
        Author author = new Author(name,surname,country);
        this.authorRepository.save(author);
    }
}
