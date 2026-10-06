package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	Scanner sc=new Scanner(System.in);
	public void filecreate() throws IOException {
		
		
		System.out.println("Enter your file name");
	String name =sc.nextLine();
		File file= new File(name);
		
		if(file.createNewFile()) {
			System.out.println("file is created");
			
		}else {
			
			System.out.println("file is already created");
		}
		
	}
	
	public void filewrite() throws IOException {
System.out.println("Enter your file");
String filename=sc.nextLine();
		FileWriter write= new FileWriter(filename);
		write.write("class j(){"
				+ "public static void main(String[] args){"
				+ "System.out.println('hello word');"
				+ "}"+
				"}");
	
		write.close();
		System.out.println("data is stored");
	}
	
	public void fileedit() throws IOException {
		System.out.println("Enter your file name");
		String filename=sc.nextLine();
		FileWriter write= new FileWriter(filename);
		System.out.println("Enter your data");
		String data= sc.nextLine();
		write.write(data);
		write.close();
		System.out.println("thank for update");
	}
	public void filedelete() throws IOException {
		System.out.println("enter your delete file");
		String data=sc.nextLine();
		File file = new File(data);
		file.delete();
		System.out.println("file is deleted");
	}
	
	public void read() throws IOException {
		FileReader fileReader= new FileReader("anand.txt");
		String data=fileReader.readAllAsString();
		System.out.println(data);
	}
	public static void main(String[] args) throws IOException{

		Main m= new Main();
//		m.filecreate();
//		m.filewrite();
//		m.fileedit();
//		m.filedelete();
//		m.read();
		
	
	}
}
