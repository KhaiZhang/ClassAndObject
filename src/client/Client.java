package client;

import model.Student;

public class Client {
    public static void main(String args[]){
        Student student=new Student();
        student.setAge(18);
        student.setGender("男");
        student.setId("12138");
        student.setName("Kur");
        System.out.println(student.toString());
    }
}
