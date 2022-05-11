package com.company.useAccessModifier2;

public class Student2 {
    protected String name = "John";
    protected String classes = "C02";

    public Student2(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
 void display(){
    System.out.println(name + " " +classes);
}
    public static void main(String[] args) {
        Student2 student = new Student2();
      student.display();
    }
}

