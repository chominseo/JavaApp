package chapter4.ex4.콜렉션;

import java.util.Scanner;

public class ObjectList {//동적 배열 구현
	private int capacity;
	private Object[] list;
	private int current;
	
	public Object[] getList() {
		return list;
	}

	public void setList(Object[] list) {
		this.list = list;
	}

	public void setCurrent(int current) {
		this.current = current;
	}


	public ObjectList() {
		capacity = 3;
		current = 0;
		list = new Object[capacity];
		System.out.println("얏호~~");
	}

	public int getCurrent() {
		
		return current;
	}
	
	public void add(Object object) {
		
		if(capacity==current) {
			Object [] temp = new Object[capacity+10];
			
			for(int i=0;i<capacity;i++)
				temp[i]=list[i];
			list = temp;
			capacity+=10;
		}
		
		list[current] = object;
		current++;
	}

	public int size() {
		
		return current;
	}

	public Object get(int i) {
		
		return list[i];
	}

	public Object getc() {
		// TODO Auto-generated method stub
		return capacity;
	}

}
