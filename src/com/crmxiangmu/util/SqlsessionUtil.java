package com.crmxiangmu.util;

import com.crmxiangmu.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlsessionUtil {
     private static SqlSessionFactory sqlSessionFactory;

    //取得sqlsession对象
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();

    public static SqlSession getSqlsession(){
        SqlSession s = t.get();
        if(s == null){
            s = sqlSessionFactory.openSession();
        }
        t.set(s);
        return s;
    }

    //关闭sqlsession对象
    public static void removeSqlsession(SqlSession sql){

       if(sql != null){
           sql.close();
           t.remove();
       }
    }

}
