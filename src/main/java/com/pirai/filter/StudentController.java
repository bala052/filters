package com.pirai.filter;

import com.pirai.filter.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.pirai.filter.Entity.Student;

import java.util.List;

@RestController
@RequestMapping("/filter")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/{name}")
    public Student getStdByName(@PathVariable(name = "name") String name) {

        return studentRepository.findByName(name);
    }

    @GetMapping("/city/{CITY}")
    public List<Student> getStdByCity(@PathVariable(name = "CITY") String city) {

        return studentRepository.findByAddressCity(city);
    }

    @GetMapping("/subject/{SUB}")
    public List<Student> getStdBySubject(@PathVariable(name = "SUB") String subject) {

        return studentRepository.findBySubjectsName(subject);
    }

}
