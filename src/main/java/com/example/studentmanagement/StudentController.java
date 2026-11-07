package com.example.studentmanagement;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // Homepage API
    @GetMapping("/")
    public String home() {
        return "Student Management Microservice is Running!";
    }

    // Get all student records
    @GetMapping("/students")
    public List<Student> getStudents() {

        return Arrays.asList(
            new Student(101, "Sathvik"),
            new Student(102, "Rahul"),
            new Student(103, "Arun"),
            new Student(104, "Kiran")
        );
    }
}