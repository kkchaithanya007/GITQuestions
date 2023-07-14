package GITQuestions;

import java.util.Scanner;

public class leastIn3 {
	static int LeastAmong3(int a,int b,int c)
	{
		int least=a;
		if(a>b)
			least=b;
		else if(least>c)
			least=b;
		return least;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();	
		System.out.print(LeastAmong3(a,b,c));
	}

}
