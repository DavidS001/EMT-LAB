package com.example.emtlab2.service;

import com.example.emtlab2.model.Country;

public interface AuthorService {

    void create(String name, String surname, Long countryId);
}
