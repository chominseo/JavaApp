package chapter4.ex4.ÄÝ·º¼Ç;

import chapter3.ex1.capsule.Exam;

public class Program {

	public static void main(String[] args) {
		int x = 3;
		Integer z = 7;
		Exam exam = new Exam();
		String s = "hello";
		double d = 2.323;
		
		Object [] list = new Object[5];
		
		list[0] = x;//new Integer(x);
		list[1] = exam;
		list[2] = s;
		list[3] = d;//new Double(d);
		list[4] = z;
		
		int x1 = (Integer)list[4];
		System.out.println(x1);
		
		for(int i=0; i<4; i++)
			System.out.println(list[i]);
		/*
		ObjectList mis = new ObjectList();
		
		
		for(int i=0;i<20;i++) {
		System.out.printf("%d-%d\n", mis.getCurrent(),mis.getc());
		mis.add(new Integer(i));
		}
		
		System.out.printf("%d", mis.get(3));
		 */

	}

}
