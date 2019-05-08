package com.example.demo.model;

/**
 * 简书
 *
 * @author 郑智国 (zhiguo.zheng@ucarinc.com)
 * @time 2019/5/8 19:25
 */
public class SimpleBook {

    private String name;

    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SimpleBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
