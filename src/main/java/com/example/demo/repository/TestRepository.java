package com.example.demo.repository;

import com.example.demo.domain.TestData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<TestData, Long> {

    Optional<TestData> findById(Long id);
}