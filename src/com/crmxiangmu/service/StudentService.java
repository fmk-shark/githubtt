package com.crmxiangmu.service;

import com.crmxiangmu.domain.Student;

import java.util.List;

public interface StudentService {

        public Student getById(String id);

        public void save(Student s);

        List<Student> getAll();

        List<Student> select2(int i);
}
