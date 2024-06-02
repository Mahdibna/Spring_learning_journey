package com.example.RestfulAPI.Controller;

import com.example.RestfulAPI.Student.Student;
import com.example.RestfulAPI.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.util.List;

@RestController
@RequestMapping(path = "/Students")
public class Requests {
    private final StudentService studentService;

    @Autowired
    public Requests(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping
    public void registerStudent( Student student) {
            studentService.addNewStudent(student);
    }
}
