package com.jiharu.main;


public class Main {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(num[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(1/0);
		}finally {
			num=null;
			System.out.println(num);
		}
		System.out.println(num);
		
	}
}
