package com.simpilearn.Lockedme;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main_File {

	public static void main(String[] args) throws IOException {
		System.out.println("___Lockers Pvt. Ltd.___");
		Scanner sc = new Scanner(System.in);
		int choice ;
		while(true) {
			System.out.println("\t1:Files \n\t2:Business Level operation \n\t3:Close APP");
			int a= sc.nextInt();
			if(a==1) {
				String path="C:\\Users\\Asus\\Project";
				File f = new File(path);
				ArrayList<String> files = new ArrayList<String>(Arrays.asList(f.list()));		
				System.out.println("Files: "+files);
			}
			else if(a==2) {	
			do{
			System.out.println("1. Insert    2. Delete\n3. Display   4. Go back");		
			choice = sc.nextInt();
			
			Main_File mf = new Main_File();
			switch(choice) {
			case 1: Create_File cf = new Create_File();
			        Create_File.main(null);
				    break;
				    
			case 2:Delete_File df = new Delete_File();
				   df.main(null);
				   break;
				   
			case 3:	Search_File sf = new Search_File();
	        		sf.main(null);
	        		break;  
			case 4: System.out.println("-:main menu:-");
	         break;
		     
					}
				}while(choice!=4);
			}
			else if(a==3) {
				System.out.println("___Successfully closed___");
				System.exit(3);
			}
			else System.out.println("You have made an invalid choice!");
		}
	}
}


