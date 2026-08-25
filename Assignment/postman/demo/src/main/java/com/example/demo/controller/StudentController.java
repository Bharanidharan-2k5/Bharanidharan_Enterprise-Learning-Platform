package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public String getStudent() {
        return "Student Details";
    }

    @PostMapping
    public String addStudent() {
        return "Student Added";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id) {
        return "Student " + id + " Updated";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return "Student " + id + " Deleted";
    }
}