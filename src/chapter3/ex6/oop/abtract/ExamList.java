package chapter3.ex6.oop.abtract;

import java.util.Scanner;

public class ExamList {
	private Exam[] list;
	private int current;
	
	public Exam[] getList() {
		return list;
	}

	public void setList(Exam[] list) {
		this.list = list;
	}

	public void setCurrent(int current) {
		this.current = current;
	}


	public ExamList() {
		this.current = 0;
		this.list = new Exam[3];
		System.out.println("¾æÈ£~~");
	}

	public int getCurrent() {
		
		return current;
	}
	
	public void add(Exam exam) {
		list[current] = exam;
		current++;
	}

	public int size() {
		
		return current;
	}

	public Exam get(int i) {
		
		return list[i];
	}

}
