package com.example.RestfulAPI.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student , Long>{
//    @Query("SELECT s FROM Student where s.getEmail() = ?1")
    Optional<Student> findStudentByEmail(String Email);
}




