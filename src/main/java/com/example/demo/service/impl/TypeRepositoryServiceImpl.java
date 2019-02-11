package com.example.demo.service.impl;

import com.example.demo.domain.TestTypeData;
import com.example.demo.repository.TypeRepository;
import com.example.demo.service.TypeRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeRepositoryServiceImpl implements TypeRepositoryService {

    private final TypeRepository repository;

    @Autowired
    public TypeRepositoryServiceImpl(TypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TestTypeData> findAll() {
        return repository.findAll();
    }

    @Override
    public void addData(TestTypeData data) {
        repository.save(data);
    }

    @Override
    public Optional<TestTypeData> findById(Long id) {
        return repository.findById(id);
    }
}
