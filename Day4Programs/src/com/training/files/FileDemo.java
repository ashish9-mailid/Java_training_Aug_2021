package com.training.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {

		File file = new File("d:\\data.txt"); 

		if(file.exists()) {
			System.out.println("File Exists..");
			System.out.println("size:"+file.length());
			System.out.println("date modified:"+new Date(file.lastModified()));
			System.out.println(file.canRead()+" "+file.canWrite());
			System.out.println("---------------------------");
			//Reading from the file

			try {
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				String line=""; 

				while((line=br.readLine())!=null) {
					System.out.println(line);

				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		else {
			System.out.println("Does not exist");
			
			try(FileWriter fw=new FileWriter(file)) { //autocloseable
				//file.createNewFile();
				
				fw.write("hello good morning\n");
				fw.write("This is a new line");
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*
			 * finally { try { fw.close(); } catch (IOException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); } }
			 */
		}
	}

}
