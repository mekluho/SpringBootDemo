package com.example.demo.service;

import com.example.demo.domain.TestData;

import java.util.List;
import java.util.Optional;

public interface TestRepositoryService {

    List<TestData> findAll();

    void addData (TestData data);

    Optional<TestData> findById(Long id);
}
