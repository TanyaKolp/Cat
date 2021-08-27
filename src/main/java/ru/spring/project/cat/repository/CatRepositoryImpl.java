package ru.spring.project.cat.repository;

import org.springframework.stereotype.Component;
import ru.spring.project.cat.items.Cat;

import java.util.ArrayList;
import java.util.List;

@Component
public class CatRepositoryImpl implements CatRepository {
    private List<Cat> cats;

    public CatRepositoryImpl() {
        cats = new ArrayList<Cat>();
        cats.add(new Cat("qwerty", 10));
        cats.add(new Cat("asd", 5));
    }

    public List<Cat> findAll() {
        return cats;
    }
}
