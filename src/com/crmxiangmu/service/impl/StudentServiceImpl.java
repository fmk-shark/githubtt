package com.crmxiangmu.service.impl;

import com.crmxiangmu.dao.StudentDao;
import com.crmxiangmu.domain.Student;
import com.crmxiangmu.service.StudentService;
import com.crmxiangmu.util.SqlsessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlsessionUtil.getSqlsession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;

    }

    @Override
    public void save(Student s) {
          studentDao.save(s);
    }

    @Override
    public List<Student> getAll() {
        List<Student> s = studentDao.getAll();
        return s;
    }

    @Override
    public List<Student> select2(int i) {
        List<Student> s = studentDao.select2(i);
        return s;
    }
}
