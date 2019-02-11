package com.example.demo.service;

import com.example.demo.domain.TestTypeData;

import java.util.List;
import java.util.Optional;

public interface TypeRepositoryService {

    List<TestTypeData> findAll();

    void addData(TestTypeData data);

    Optional<TestTypeData> findById(Long id);
}
