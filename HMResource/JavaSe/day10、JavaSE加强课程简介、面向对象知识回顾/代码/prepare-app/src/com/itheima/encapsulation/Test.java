package com.itheima.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        // s.age = -23;
        s.setAge(23);
        System.out.println(s.getAge());
    }
}
