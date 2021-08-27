package ru.spring.project.cat.service;

import ru.spring.project.cat.items.Cat;

import java.util.List;

public interface CatService {
    List<Cat> getAll();
}
