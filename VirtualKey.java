package com.simplilearn.project;

import java.io.IOException;
import java.util.Scanner;

public class VirtualKey {

	public static void main(String[] args) throws IOException {
		
		System.out.println("*******Welcome to LockedMe.com********");
		System.out.println("Application Name : VirtualKey");
		System.out.println("*******Developer Details:************");
		System.out.println("Name : Rohith B Patel");
		System.out.println("Designation : Student at Simplilearn");
		System.out.println("Date of Starting a Project : 10/5/2022");
		System.out.println();
		System.out.println("Enter yes to enter the application features");
		Scanner sc = new Scanner(System.in);
		String y = sc.next();
		String yes= "yes";
		while(yes.contentEquals(y)) {
			
			System.out.println("Enter 1 to get file names in ascending order");
			System.out.println("Enter 2 to for Business Level Operation");
			System.out.println("Enter 3 to close a Application");
			int option=sc.nextInt();
			if(option==1) {
				
				//FileNamesInAscendingOrder ob=new FileNamesInAscendingOrder();
				FileNamesInAscendingOrder.SortedFiles();
			}
			//entering in to Businesslevel operation
			else if(option==2) {
				//Business
				System.out.println("Welcome to buisness level operations");
				System.out.println("Enter 1 to add a file");
				System.out.println("Enter 2 to Delete file");
				System.out.println("Enter 3 to search file");
				System.out.println("Enter 4 to go  back");
				int n=sc.nextInt();
				BusinessLevelOperation ob1=new BusinessLevelOperation();
				switch(n) {
				case 1 : BusinessLevelOperation.Add();
						break;
				case 2: ob1.delete();
						break;
				case 3 : ob1.search();
						break;
				case 4 :
					break;
				case 5 : System.out.println("Invalid input");
						break;
				}
				
			}
			//To close application
			else {
				System.out.println("Application is closed");
				System.exit(option);

			}
			
		}
		
	}
}
