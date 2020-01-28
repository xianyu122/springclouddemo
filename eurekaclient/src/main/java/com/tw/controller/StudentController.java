package com.tw.controller;


import com.tw.dao.StudentDao;
import com.tw.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentDao.getAllStudent();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentDao.getStudentById(id);
    }

    @PutMapping("/saveStudent")
    public void saveStudent(@RequestBody Student student){
        studentDao.saveStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentDao.deleteStudentById(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student){
        studentDao.updateStudent(student);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口:"+this.port;
    }

}
