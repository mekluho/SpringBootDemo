package com.example.demo.service.impl;

import com.example.demo.domain.TestData;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestRepositoryServiceImpl implements TestRepositoryService {

    private final TestRepository repository;

    @Autowired
    public TestRepositoryServiceImpl(TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TestData> findAll() {
        return repository.findAll();
    }

    @Override
    public void addData(TestData data) {
        repository.save(data);
    }

    @Override
    public Optional<TestData> findById(Long id) {
        return repository.findById(id);
    }
}
