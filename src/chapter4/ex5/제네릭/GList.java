package chapter4.ex5.제네릭;

import java.util.Scanner;

public class GList<T> {//동적 배열 구현
	private int capacity;
	private T[] list;
	private int current;
	
	public Object[] getList() {
		return list;
	}

	public void setList(T[] list) {
		this.list = list;
	}

	public void setCurrent(int current) {
		this.current = current;
	}


	public GList() {
		capacity = 3;
		current = 0;
		list = (T[]) new Object[capacity];
		System.out.println("얏호~~");
	}

	public int getCurrent() {
		
		return current;
	}
	
	public void add(T object) {
		
		if(capacity==current) {
			T [] temp = (T[]) new Object[capacity+10];
			
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

	public T get(int i) {
		
		return list[i];
	}

	public Object getc() {
		// TODO Auto-generated method stub
		return capacity;
	}

}
