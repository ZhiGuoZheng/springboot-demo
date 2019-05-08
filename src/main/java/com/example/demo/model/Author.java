package com.example.demo.model;

/**
 * 作者
 *
 * @author 郑智国 (zhiguo.zheng@ucarinc.com)
 * @time 2019/5/8 19:25
 */
public class Author {

    private String name;

    private int age;

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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
