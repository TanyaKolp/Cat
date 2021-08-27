package ru.spring.project.cat.repository;

import ru.spring.project.cat.items.Cat;

import java.util.List;

public interface CatRepository {
    List<Cat> findAll();
}
