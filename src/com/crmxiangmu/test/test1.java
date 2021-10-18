package com.crmxiangmu.test;

import com.crmxiangmu.dao.StudentDao;
import com.crmxiangmu.domain.Student;
import com.crmxiangmu.util.SqlsessionUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        //StudentService a = (StudentService) new ServiceFactory().getservice(new StudentServiceImpl());
        /*List<Student> llist =  studentDao.select2(25);
        for (Student S:llist
             ) {
            System.out.println(S);
        }*/
        StudentDao studentDao = SqlsessionUtil.getSqlsession().getMapper(StudentDao.class);
        List<Map<String,Object>> s = studentDao.check("B0001");
        for (Map<String,Object> b:s
             ) {
            Set<String> b1 = b.keySet();
            for (String b2:b1
                 ) {
                System.out.println(b2);
                System.out.println(b.get(b2));
            }

        }
    }

}
