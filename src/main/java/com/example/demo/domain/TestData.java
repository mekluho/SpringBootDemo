package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "spring_test_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "text_data")
    private String textData;

    @Column(name = "numeric_data")
    private Long numericData;
}
