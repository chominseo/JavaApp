package chapter2.ex4.shuffle;

import java.util.Random;

public class TestProgram {

	public static void main(String[] args) {
		
		int[][] lottos = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[] temp = lottos[0];
		lottos[0]=lottos[2];
		lottos[2]=temp;
		
		System.out.printf("%d", lottos[0][2]);
		
		/*
		int[]nums= {3,4,5,2,12,23,55,75};
		
		for(int i=0;i<nums.length;i++)
			if(nums[i]==55)
				System.out.printf("%d", i);
		
		
		int[]nums1={1,2,3};
		int[]nums2={4,5,6};
		int[]nums=new int[nums1.length+nums2.length];
		
		for(int i=0;i<nums1.length;i++) 
			nums[i]=nums1[i];
		for(int i=0;i<nums2.length;i++) 
			nums[i+nums1.length]=nums2[i];
		
		for(int i=0;i<nums.length;i++)
		System.out.printf("%d ", nums[i]);
		
		int[]nums = {1,2,3,4,5,6,7,8,9,10};
		int[]nums2=new int[20];
		
		for(int i=0;i<nums2.length;i++) 
			System.out.printf("%d ", nums2[i]);
		System.out.println();
		
		for(int i=0;i<nums.length;i++)
			nums2[i]=nums[i];
		
		for(int i=0;i<nums2.length;i++) 
			System.out.printf("%d ", nums2[i]);
		
	
		 Course cls=new Course();//Value type Variable, Reference Type Variable
		
		cls.id = 3;
		cls.name="자바풀스텍";
		
		int[]nums = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<10;i++)
			System.out.printf("%d ", nums[i]);
		
		Random rand=new Random();
		
		for(int i=0;i<5;i++) {
		int s = rand.nextInt(10);
		int d = rand.nextInt(10);
		
		System.out.println();
		
		System.out.println(s+1);
		System.out.println(d+1);
		
		int temp = nums[s];
		nums[s] = nums[d];
		nums[d] = temp;
		
		for(int j=0;j<10;j++)
			System.out.printf("%d ", nums[j]);
			}
		*/
		
	

		
	}

}
