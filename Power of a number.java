package com;
 
import java.util.Scanner;
 
public class PowerOfNumber {
	public static void main(String args[]) {
		int n, p, result=1, i;
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Enter a number and its power:");
		n = sc.nextInt();
		p =sc.nextInt();
 
		for(i = 1; i <= p; ++i){
			result = result * n;
		}
		
		System.out.println(result);
	}
}