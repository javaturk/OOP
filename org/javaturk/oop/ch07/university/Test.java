package org.javaturk.oop.ch07.university;

public class Test {

	public static void main(String[] args) {
		Department d1 = new Department();
		
        Professor p1 = new Professor();
        p1.name = "Ahmet Arslan";
        
        Course c1 = new Course();
        
        Student s1 = new Student();
        s1.name = "Akin Kaldiroglu";
        
        d1.name = "Software Engineering";
        d1.head = p1;
                
        c1.name = "Int. to Software Engineering";
        c1.department = d1;
//        Professor p2 = new Professor();
//        p2.name = "Ahmet Aslan";
        c1.teacher = p1;
        
        p1.coursesGiven = new Course[5];
        p1.coursesGiven[0] = c1;
        p1.advisee = new Student[10];
        p1.advisee[0] = s1;
        
        d1.courses = new Course[100];
        d1.courses[0] = c1;
        
        
        s1.advisor = p1;
        s1.coursesTaken = new Course[10];
        s1.coursesTaken[0] = c1;
        
        System.out.println("Name of student s1's first course is " + s1.coursesTaken[0].name);
        System.out.println("Name of student s1's first course's professor is " + s1.coursesTaken[0].teacher.name);
	}
}
