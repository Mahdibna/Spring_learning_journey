package com.example.RestfulAPI.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public String addNewStudent(Student s) {
        Optional<Student> studentExistence = studentRepository.findStudentByEmail(s.getEmail());
        if (studentExistence.isPresent()) {
            return "email taken";
        } else {
            try {
                studentRepository.save(s);
                return "student added successfully";
            } catch (Exception ex) {
                return ex.getMessage();
            }
        }
    }

}
