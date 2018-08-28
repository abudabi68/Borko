package edu.sah;

import java.util.Random;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		int a[]=new int[1];
		Scanner s=new Scanner(System.in);
		System.out.println("Unesite broj zeljene pozicije");
		int b=s.nextInt();
		//System.out.println("Unesite slovo pozicije");
		String next=s.nextLine();
		Random rand=new Random();
		for(int i=0;i<a.length;i++){
			a[i]=rand.nextInt(8)+1;
			System.out.println(a[i]);
			
				
			
		}
		
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char letter = abc.charAt(rand.nextInt(abc.length()));
		System.out.println(letter);
		
	}

}
