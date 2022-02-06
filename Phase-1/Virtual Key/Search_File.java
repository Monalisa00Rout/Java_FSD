package com.simpilearn.Lockedme;

import java.io.File;
import java.util.Scanner;

public class Search_File {
	public static void main(String[] args) {
		String path="C:\\Users\\Asus\\Project\\";
		 File f=new File(path);
	     Scanner sc=new Scanner(System.in);
		 System.out.println("eneter a file to search");
		 String filenameserach=sc.nextLine();
		 File filename[]=f.listFiles();
		 int flag=0;
	     for(File ff:filename) {
		 if(ff.getName().equals(filenameserach)){
			 flag=1;				
			 break;
			 }
			 else {
			 flag=0;			
			 	}
		     }
			 if(flag==1) {
			 System.out.println("file is available");
			 }
			 else {
			 System.out.println("file is not available");
			 }
	     
	}
}
