package com.tw.dao;

import com.tw.domain.Student;

import java.util.Collection;

public interface StudentDao {

    public Collection<Student> getAllStudent();

    public void deleteStudentById(Long id);

    public void saveStudent(Student student);

    public void updateStudent(Student student);

    public Student getStudentById(Long id);
}
