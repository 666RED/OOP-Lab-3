package com.hongchen.question2;

public class Main {

	public static void main(String[] args) {
		System.out.println("a \t b \t a power of b");
		for(int i = 1, j = 2; i < 6 || j < 7; i++, j++) {
			System.out.println(i + "\t " + j + "\t " + (int)Math.pow(i, j));
		}
	}
}

