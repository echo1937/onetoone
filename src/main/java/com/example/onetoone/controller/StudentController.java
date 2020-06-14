package com.example.onetoone.controller;

import com.example.onetoone.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("student")
    public Object getStudent(@PageableDefault Pageable pageable) {
        return studentRepository.findCustom(pageable);
    }
}
