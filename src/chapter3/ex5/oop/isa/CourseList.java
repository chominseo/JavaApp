package chapter3.ex5.oop.isa;


import java.util.Scanner;

public class CourseList {
	int current;
	Course[] courses;
	
	public CourseList() {
		this.current = 0;
		this.courses = new Course[100];
	}
}
	
	
	