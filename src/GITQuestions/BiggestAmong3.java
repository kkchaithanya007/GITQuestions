package GITQuestions;

import java.util.Scanner;

public class BiggestAmong3 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers 3 for a,b,c");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		System.out.println("Enter 3 numbers a="+a+"b="+b+"c="+c);
		
		int max=b;
		if(a>max)
		{
			a=max;
		}
		else if(c>max)
		{
			c=max;
		}
		System.out.println("Max amoung 3="+max);
		
		sc.close();
			
	}

}
