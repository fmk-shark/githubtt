package com.crmxiangmu.vo;

public class StudentAndClassroomVO {

    //学生的信息
    private String id;
    private String name;
    private Integer age;  //包装类用integer可以为空
    private String studentclassid;

    //班级的信息
    private String classid;
    private String classname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStudentclassid() {
        return studentclassid;
    }

    public void setStudentclassid(String studentclassid) {
        this.studentclassid = studentclassid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "StudentAndClassroomVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", studentclassid='" + studentclassid + '\'' +
                ", classid='" + classid + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }
}
