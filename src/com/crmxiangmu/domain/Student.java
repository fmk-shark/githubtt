package com.crmxiangmu.domain;

public class Student {
    private String id;
    private String name;
    private Integer age;  //包装类用integer可以为空
    private String classid;

    public Student() {
    }

    public Student(String id, String name, Integer age, String classid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classid = classid;
    }

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

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classid='" + classid + '\'' +
                '}';
    }
}
