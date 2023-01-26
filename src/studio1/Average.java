package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.println("The first of two intergers to be averaged?");
		int n1= in.nextInt();
		System.out.println("The second of two intergers to be averaged?");

		int n2= in.nextInt();
		System.out.println("The third of two intergers to be averaged?");
		int n3= in.nextInt();
		double total= n1+n2+n3;
System.out.println(total/3);
	}

}
