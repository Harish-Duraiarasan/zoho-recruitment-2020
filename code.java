package test;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				if(j<i) {
					System.out.print(i);
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
