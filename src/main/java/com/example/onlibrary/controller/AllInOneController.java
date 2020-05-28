package com.example.onlibrary.controller;

import com.example.onlibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class AllInOneController {

    @Autowired
    private BookRepository bookRepository;
    @RequestMapping(method = GET, value = "/book")
    public List<HashMap> getBook() { return bookRepository.findAll(); }
}
