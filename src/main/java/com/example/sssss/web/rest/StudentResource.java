package com.example.sssss.web.rest;

import com.example.sssss.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentResource {

    @GetMapping("/students/all")
    public ResponseEntity getAll(){

        Student student = new Student(1L, "Abdurahim", "Abdurasulov", "3-kurs");
        Student student1 = new Student(1L, "Abduhakim", "Abdurasulov", "1-kurs");
        Student student2 = new Student(1L, "Abdulaziz", "Abdurasulov", "4-kurs");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        return ResponseEntity.ok(students);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Student student = new Student(1L, "Abdurahim", "Abdurasulov", "3-kurs");
        return ResponseEntity.ok(student);
    }
}
