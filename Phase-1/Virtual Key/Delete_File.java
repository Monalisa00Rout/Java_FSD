package com.simpilearn.Lockedme;

import java.io.File;
import java.util.Scanner;

public class Delete_File {
	public static void main(String[] args){
		 String path="C:\\Users\\Asus\\Project\\";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the file name to delete");
		 String filename=sc.nextLine();
			 String finalfilename=path+filename;
			 File f=new File(finalfilename);
			 boolean result=f.delete();
			 if(result==false) {
				 System.out.println("file is not found");
				 }
				else {
				
				 System.out.println(filename+" is deleted");
				}	
		 
		}
}
