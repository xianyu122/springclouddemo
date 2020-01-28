package com.tw.dao.impl;

import com.tw.dao.StudentDao;
import com.tw.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentDaoImpl implements StudentDao {

    private static Map<Long,Student> map;

    static {
        map = new HashMap<>();
        map.put(1L,new Student(1L,"小明",20));
        map.put(2L,new Student(2L,"小王",22));
        map.put(3L,new Student(3L,"小李",23));
    }

    @Override
    public Collection<Student> getAllStudent() {
        return map.values();
    }

    @Override
    public void deleteStudentById(Long id) {
        map.remove(id);
    }

    @Override
    public void saveStudent(Student student) {
        map.put(student.getId(),student);
    }

    @Override
    public void updateStudent(Student student) {
        map.put(student.getId(),student);
    }

    @Override
    public Student getStudentById(Long id) {
        return map.get(id);
    }
}
