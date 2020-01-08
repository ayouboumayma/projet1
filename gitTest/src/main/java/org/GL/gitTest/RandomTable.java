package org.GL.gitTest;

import java.util.Random;

public class RandomTable {

	public static int[] randomTab(int size) {
		Random rd = new Random(); 
	      int[] arr = new int[size];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(); 
	         System.out.println(arr[i]); 
	        
		}
	      return arr;
	}
	public static void main(String[] args) {
		randomTab(10);
	}

}
