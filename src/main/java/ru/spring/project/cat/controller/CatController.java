package ru.spring.project.cat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.spring.project.cat.items.Cat;
import ru.spring.project.cat.service.CatService;
import ru.spring.project.cat.service.CatServiceImpl;

import java.util.List;

@RestController
public class CatController {

    @Autowired
    private CatService service;

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format(template, name);
    }

    @GetMapping("/cats")
    public List<Cat> getAllCats(){

        return service.getAll();
    }
}
