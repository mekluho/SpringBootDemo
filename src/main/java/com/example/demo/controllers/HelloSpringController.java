package com.example.demo.controllers;

import com.example.demo.domain.TestData;
import com.example.demo.service.TestRepositoryService;
import com.example.demo.service.impl.TestRepositoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class HelloSpringController {

    private final TestRepositoryService service;

    public HelloSpringController (TestRepositoryServiceImpl service) {
        this.service = service;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<TestData> getAll() {

        return service.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addTestData(@RequestBody TestData data) {
        TestData testData = new TestData();

        service.addData(data);
    }

    @RequestMapping(value = "/byId", method = RequestMethod.GET)
    public Optional<TestData> findById (@RequestParam Long id) {
        return service.findById(id);
    }
}
