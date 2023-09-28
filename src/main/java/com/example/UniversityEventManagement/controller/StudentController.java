package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Department;
import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentServices umeServices;

    @PostMapping("student")
    public String addStudent( @RequestBody List<Student> newStudent){
       return umeServices.addStudent(newStudent);
    }
    @PutMapping("student/dep")
    public String updateStudentDep(@RequestParam Integer id, @RequestParam Department department){
       return umeServices.updateStudentDep(id,department);
    }

    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return umeServices.deleteStudent(id);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return umeServices.getAllStudents();
    }

    @GetMapping("student/id{id}")
    public List<Student> getStudentById(@PathVariable Integer id){
        return umeServices.getStudentById(id);
    }



}
