package com.company.staticMethod;

public class Student {
    private int id;
    private String name;
    private static String college = "BBDIT";

    // Phương thức khởi tạo để khởi tạo biến
    Student(int r, String n) {
        id = r;
        name = n;

    }

    // static method để thay đổi giá trị của biến static
     static void change() {
        college = "CODEGYM";
    }

    // phương thức hiển thị giá trị
    void display() {
        System.out.println(id + " " + name + " " +college);
    }

    public static void main(String[] args) {
        Student.change();
        // write your code here
        Student student1 = new Student(1, "Bin");
        Student student2 = new Student(2, "Cin");
        Student student3 = new Student(3, "Sin");

        student1.display();
        student2.display();
        student3.display();
    }
}
