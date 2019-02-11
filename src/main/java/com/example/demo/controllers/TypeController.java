package com.example.demo.controllers;

import com.example.demo.domain.TestTypeData;
import com.example.demo.service.TypeRepositoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/type")
public class TypeController {

    private final TypeRepositoryService service;

    public TypeController(TypeRepositoryService service) {
        this.service = service;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<TestTypeData> getAll() {

        return service.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addTestData(@RequestBody TestTypeData data) {

        service.addData(data);
    }

    @RequestMapping(value = "/byId", method = RequestMethod.GET)
    public Optional<TestTypeData> findById (@RequestParam Long id) {
        return service.findById(id);
    }
}
