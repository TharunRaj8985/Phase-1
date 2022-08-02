package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
public class CreateWritefile {

	// Methods to Create File
	// It will throw exception if file path has error
	public static void CreateFileUsingFileClass() throws IOException
	{
		//create new File
		File file1 = new File("H:\\files\\testfile130-07-2022.txt");
		if(file1.createNewFile())
		{
			System.out.println("File created Succesfully");
		}
		else
		{
			System.out.println("File already Exist");
		}
		// Here if we give false it will not append data if file already exist
		FileWriter Fw = new FileWriter(file1,false);
		//FileWriter Fw = new FileWriter(file1,True);
		Fw.write("Welcome to Simplilearn");
		Fw.close();
	}
	public static void CreateFileUsingFileOutputStream() throws IOException
	{
		FileOutputStream fos = new FileOutputStream("H:\\files\\CreateUsingOutputstream.txt");
		// here we need to convert input data into byte array
		String input = "Hello I Have Created File using OutputStream";
		byte[] array = input.getBytes();
		fos.write(array);
		System.out.println("Data Written Successfully");
		fos.close();
	}
	public static void CreateFileUsingNIO() throws IOException
	{
		Path path1 = Paths.get("H:\\files\\UsingNIO.txt");
		String input = "Hello I have Created file Using NIO";
		byte[] arr1 = input.getBytes();
		// Here there will be standard options like to create and append
		// if we want to append data after first run you can use append else you can remove
	    Files.write(path1, arr1, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	    System.out.println("Data Created Successfully");
	    // if we want to send list of lines at single time
	    // Using List we can write list of strings at single attempt
	    Path path2 = Paths.get("H:\\files\\UsingNIO1.txt");
	    List<String> list1 = Arrays.asList("Hello this is my first line","This is my second line");
	    Files.write(path2, list1, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}
	public static void main(String[] args)
	{
		try {
			//CreateFileUsingFileClass();
			//CreateFileUsingFileOutputStream();
			CreateFileUsingNIO();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}	
	}
	
	
	
}
