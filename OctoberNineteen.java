package org.logu;

public class OctoberNineteen {
 public static void main(String[] args) {
	 int a[][]=new int [4][5];
	 a[0][0]=10;
	 a[0][1]=20;
	 a[0][2]=30;
	 a[0][3]=40;
	 a[0][4]=50;
	 a[1][0]=60;
	 a[1][1]=70;
	 a[1][2]=80;
	 a[1][3]=90;
	 a[1][4]=100;
	 System.out.println(a[0][1]);
	 for (int i = 1; i < 4; i++) {
		 for (int j = 2; j < 5; j++) {
			 System.out.println(a[i][j]);
			
		}
		
	}
	 System.out.println(".....");
	 for (int[] x : a) {
		 for (int i : x) {
			 System.out.println(i);
			
		}
		
	}
 }
 
}
