package com.simplilearn.project;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public  class FileNamesInAscendingOrder {
	
	public static void SortedFiles() {
		
		System.out.println("Enter the path of folder where files name need to be sorted ");
		//D:\2020 Simulink
		Scanner sc=new Scanner(System.in);
		String path =sc.nextLine();
		File folder = new File(path);
		File[] files=folder.listFiles();
		//Arrays.sort(files);
		for(File file : files) {
			System.out.println(file.getName());
		}	
		
	}
}
