package com.company.Exercise3;

public class StudentService {
    public Student[] findStudentAbove60 (Student[] students, float criteriaOfPer){
        int count = 0;
        Student[] s = new Student[10];
        for(int i = 0; i < students.length; i++){
            if(students[i].percentage > criteriaOfPer)
                s[count++] = students[i];
        }

//        for(Student st: s)
//            System.out.println(st);
        return s;
}}
