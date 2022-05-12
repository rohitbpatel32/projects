package com.simplilearn.project;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Scanner;

public class BusinessLevelOperation {
	
	public static void Add() {
		System.out.println("Enter the path in which file need to be created");
			Scanner sc=new Scanner(System.in);
			String path=sc.nextLine();
			System.out.println("Enter the file name with format");
			String filename=sc.nextLine();
		File myfile = new File(path+filename);
		try {
			if(myfile.createNewFile()) 
				System.out.println("File created successfully");
			else
				System.out.println("File not created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void delete() throws IOException
	{
		
			try {
				System.out.println("Enter the path in which file need to be DELETED");
				Scanner sc=new Scanner(System.in);
				String path=sc.nextLine();
				System.out.println("Enter the file name with format");
				String filename=sc.nextLine();
			//File myfile = new File(path+filename);
				Path myfile= Paths.get(path+filename);
				if(Files.deleteIfExists(myfile))
					System.out.println("File deleted Successfully");
				else
					System.out.println("File does not exist");
				//sc.close();
			} 
			catch (NoSuchFileException e) {
				e.printStackTrace();
			}
			
			
		
	}
	
	public void search() {
		System.out.println("Enter the path in which file need to be SEARCHED");
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		System.out.println("Enter the file name with format");
		String filename=sc.nextLine();
        // Getting the file by creating object of File class
        File f = new File(path+filename);
 
        // Checking if the specified file exists or not
        if (f.exists())
 
            // Show if the file exists
            System.out.println(filename+" Exists");
        else
 
            // Show if the file does not exists
            System.out.println("Does not Exists");
       
		
	}
	

}
