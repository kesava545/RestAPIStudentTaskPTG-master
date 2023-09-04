package com.example.studentData.repository;

import com.example.studentData.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity ,Long>
        {
}
