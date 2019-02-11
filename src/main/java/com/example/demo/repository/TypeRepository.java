package com.example.demo.repository;

import com.example.demo.domain.TestTypeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository extends JpaRepository<TestTypeData, Long> {

    Optional<TestTypeData> findById(Long id);
}
