package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Department;
import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.repo.IEventRepo;
import com.example.UniversityEventManagement.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
@Service
public class StudentServices {

    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudent(List<Student> newStudent){
         iStudentRepo.saveAll(newStudent);
         return "Student Added";
    }
    public String updateStudentDep(Integer id, Department department){
        Student pStudent = iStudentRepo.findById(id).orElse(null);
        if(pStudent != null){
            pStudent.setStudentDepartment(department);
            iStudentRepo.save(pStudent);
            return "Info Updated";
        }
        else
            return "Student Not Found";
    }
    public String deleteStudent(Integer id){
        iStudentRepo.deleteById(id);
        return "Student Deleted";
    }

    public List<Student> getAllStudents(){
        return (List<Student>) iStudentRepo.findAll();
    }

    public List<Student> getStudentById(Integer id){
        return (List<Student>) iStudentRepo.findAllById(Collections.singleton(id));
    }

}
