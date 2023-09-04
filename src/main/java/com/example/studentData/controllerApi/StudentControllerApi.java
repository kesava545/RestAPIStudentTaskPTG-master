package com.example.studentData.controllerApi;

import com.example.studentData.entity.StudentEntity;
import com.example.studentData.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControllerApi {
    @Autowired
    StudentService studentService;
    @PostMapping("/createdata/insert")
    public StudentEntity createstudentdata(@RequestBody StudentEntity studentEntity)
    {
        return studentService.createstudentdata(studentEntity);
    }
    @PostMapping("/createdatall/insertall")
    public List<StudentEntity> createstudentalldata(@RequestBody List<StudentEntity> studentEntity)
    {
        return studentService.createallstudentdata(studentEntity);
    }


    @GetMapping("/getallstudentsdata/all")
    public List< StudentEntity > getstudentsdatas()
    {
        return studentService.getstudentsdata();
    }
    @GetMapping("/getstudentdata/{stdId}")
    public StudentEntity getstudentdatabyid(@PathVariable  Long stdId){
        return studentService.getstudentdatabyid(stdId);
    }
@DeleteMapping("/deletestudentdatabyid/{stdId}")
    public void deletestudentdatabyid(@PathVariable  Long stdId){
       studentService.deletestudentdatabyid(stdId);

    }
    @PutMapping ("/updatestudentdatabyid/{stdId}")
    public StudentEntity updatestudentdata (@PathVariable  Long stdId ,@RequestBody StudentEntity updatestudentdata){

        return studentService.updatestudentdata(stdId,updatestudentdata);
    }
}
