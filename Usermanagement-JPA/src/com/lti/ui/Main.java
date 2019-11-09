package com.lti.ui;

import java.util.Scanner;

import com.lti.model.Users;
import com.lti.service.UserService;

public class Main {
	private static UserService service = null;
	static{
		service = new UserService();	
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String ch;
		System.out.println("----------LOGIN--------");
		System.out.println("Enter Username:");
		String uname=sc.next();
		System.out.println("Enter Password: ");
		String pwd=sc.next();
		boolean res=service.checkLogin(uname, pwd);
		if(res)
		{System.out.println("Login Successful!");
		
		System.out.println("1.Add user");
		System.out.println("2.Update user");
		System.out.println("3.Delete user");
		System.out.println("4.Display user");
		System.out.println("5.Display user by First Name");
		System.out.println("6.Display user by Username");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the username");
			String uname= sc.next();
			System.out.println("Enter the password");
			String pswd= sc.next();
			System.out.println("Enter Firstname");
			String fname= sc.next();
			System.out.println("Enter Lastname");
			String lname= sc.next();
			System.out.println("Enter mobile number");
			int mobno= sc.nextInt();
			Users user= new Users(uname,pswd,fname,lname,mobno);
			boolean result = service.addUser(user);
			
		case 2:
			System.out.println("Enter the username");
			String uname1= sc.next();
			System.out.println("Enter the password");
			String pswd1= sc.next();
			System.out.println("Enter Firstname");
			String fname1= sc.next();
			System.out.println("Enter Lastname");
			String lname1= sc.next();
			System.out.println("Enter mobile number");
			int mobno1= sc.nextInt();
			Users user= new Users(uname1,pswd1,fname1,lname1,mobno1);
			boolean result = service. modifyUser(user);
		}
		
		
		
		
		
		
		/*do{
			
			
			System.out.println("continue?(y/n)");
			ch=sc.next();
		}while(ch=='y'||ch=='Y')
		*/
		
		
		
		}
		
		
		
		
		
		else
			System.out.println("Invalid Credentials");
		
		
		
		
		
	}

}
