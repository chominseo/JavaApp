package chapter4.ex5.���׸�;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import chapter3.ex1.capsule.Exam;

public class Program {

	public static void main(String[] args) {
		/*
		int x = 3;
		Integer z = 7;
		Exam exam = new Exam();
		String s = "hello";
		double d = 2.323;
		
		GList<Integer> list = new GList<>();//GList list = new GList();
		
		list.add(3);
		
		GList<Exam> list1 = new GList();
		
		list1.add(new Exam());
		
		List list2 = new ArrayList();
		
		Set �迭
		List �迭
		Map �迭
		
		������ : �ĺ���
		*/
		
		Set<Integer> set = new HashSet();
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(4);
		set.size();
		
		//set.iterator().next(); // iterator (�����Ѵ�)
		
		//for each 
		for(int x : set)
			System.out.println(x);
		
		/*
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		*/
		
		//Ư���� �� �ϳ��� ������ Ű�� ���� �ݷ���(���� ���� ���� �ö� ����� ��*�ߺ����ſ� �߿�)
		
		
		
		List<Integer> list = new ArrayList();
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(4);
		
		list.get(0);//->3
		
		for(int x : list)
			System.out.print(x);
		
		//���� ������ �� Ű�� �Ǵ� �ݷ���
		
		Map<String, Integer> map = new HashMap<>();
		map.put("��ȣ", 3);
		map.put("����", 4);
		//Ű�� ���� �Բ� �߰��ϴ� �ݷ���
		
		map.get("��ȣ");
		
		for(String key : map.keySet())
			System.out.println(map.get(key));
		
		
		/*
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
		
		ObjectList mis = new ObjectList();
		
		
		for(int i=0;i<20;i++) {
		System.out.printf("%d-%d\n", mis.getCurrent(),mis.getc());
		mis.add(new Integer(i));
		}
		
		System.out.printf("%d", mis.get(3));
		*/

	}

}
