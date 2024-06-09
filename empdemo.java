package Scannerproj;

import java.util.Scanner;

public class empdemo
{

	public static void main(String[] args) 
	{
		
				emp em = new emp();
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter name: ");
				String name = sc.next();
				em.setEname(name);
				
				System.out.println("Enter email: ");
				String email = sc.next();
				em.setEmail(email);
				
				System.out.println(name);
				System.out.println(email);
				
				sc.close();
		}
}
