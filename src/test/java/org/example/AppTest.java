package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest {
    public static  void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml") ;

        Student student = (Student) context.getBean("St1");
        //student.setName("Aswath");
        //System.out.println(student.getName());
       // student.setAge(22);
       // System.out.println(student.getAge()+ " "+ student.getRno());
        student.exam();
    }
}
