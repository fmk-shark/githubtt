package com.crmxiangmu.dao;

import com.crmxiangmu.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {



    public Student getById(String id);

    public void save(Student s);

    List<Student> getAll();

    List<Student> select2(int i);

    List<Map<String, Object>> select3(Student s);

    List<Map<String, Object>> check(String s);
}
