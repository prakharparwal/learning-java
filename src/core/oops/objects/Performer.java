package core.oops.objects;

import core.oops.classes.Student;

public class Performer {

    public static void main(String[] args) {
        Student s1 = new Student(101, "FirstStudent");
        Student s2 = new Student(101, "SecondStudent");
        Student s3 = new Student(101, "ThirdStudent");

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s3.getId());
        System.out.println(s3.getName());

    }
}
