package com.example.studentData.service;

import com.example.studentData.entity.StudentEntity;
import com.example.studentData.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public StudentEntity createstudentdata(StudentEntity studentEntity)
    {
        return studentRepository.save(studentEntity);
    }

    public  List<StudentEntity> createallstudentdata( List <StudentEntity> studentEntity)
    {
        ArrayList<StudentEntity> studentEntitylist=new ArrayList<>();
        for (StudentEntity s :studentEntity)
             {
                StudentEntity se=studentRepository.save(s);
                studentEntitylist.add(se);
        }
        return studentEntitylist;

    }

    public List< StudentEntity > getstudentsdata()
    {
        return studentRepository.findAll();
    }
    public StudentEntity getstudentdatabyid(Long stdId){
        return  studentRepository.findById(stdId).orElse(null);
    }
    public void deletestudentdatabyid(Long stdId){
        studentRepository.deleteById(stdId);

    }
    public StudentEntity updatestudentdata(Long stdId, StudentEntity updatestudentdata) {
        StudentEntity studentEntity1 = getstudentdatabyid(stdId);
        if (studentEntity1 != null) {
            studentEntity1.setStdName(updatestudentdata.getStdName());
            studentEntity1.setStdAddress(updatestudentdata.getStdAddress());
            return studentRepository.save(studentEntity1);
        }
        return null;
    }



}
