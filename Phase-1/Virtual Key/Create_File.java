package com.simpilearn.Lockedme;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Create_File {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Asus\\Project\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name to Create");
		String fname = path+sc.nextLine();
		File f = new File(fname);
		boolean result = f.createNewFile();
	
		 if(result==false) {
		 System.out.println("file is not created");
		 }
		else {
		
		 System.out.println("file is created at : "+fname);
	
	}
  }
}
