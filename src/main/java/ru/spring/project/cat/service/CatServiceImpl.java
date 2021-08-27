package ru.spring.project.cat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.project.cat.items.Cat;
import ru.spring.project.cat.repository.CatRepository;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private CatRepository repository;

    public List<Cat> getAll() {
        return repository.findAll();
    }
}
