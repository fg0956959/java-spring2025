/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentjsnclass;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Franklin Gainer
 */
class Student
{
    private String name;
    private String grade;
    private int age;
    private int id;
    
    public Student(int ID, String Name,String Grade,int Age){
        this.age = Age;
        this.name = Name;
        this.grade = Grade;
        this.id = ID;
    }
    
    public String getplayerName(){return name;}
    public String getsGrade(){return grade;}
    public int getsID(){return id;}
    public int getsAge(){return age;}
    
    public void setName(String Name){this.name = Name;}
    public void setGrade(String Grade){this.grade = Grade;}
    public void setAge(int Age){this.age = Age;}
    public void setID(int ID){this.id = ID;}
    
    
}
public class StudentjsnClass 
{

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
