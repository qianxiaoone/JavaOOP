/*
 * Copyright (C), 2014-2019
 * Package model 
 * FileName: Student.java
 * Author:   wang-hc
 * Date:     2019年7月16日 下午8:07:09
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年7月16日下午8:07:09                     1.0                  
 *===============================================================================================
 */
package model;
public class Student {
    private String name;
    private int age;
    private String sex;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(String name,int age,String sex,String id) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }
    
}
