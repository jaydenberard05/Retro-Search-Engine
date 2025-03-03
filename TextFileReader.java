package engine;

/**
 * @author Jayden Berard
 * @since 12-10-24
 * @version 1.0.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList; 
import java.util.Arrays; 

public class TextFileReader {
	
	public static void main(String[] args) {		// TODO Auto-generated method stub
		System.out.println("Verison 1.0.0");					
		HashMap<String,Website> engine = new HashMap<String,Website>(20);
		//Tired making the HashMap using a List of Websites but too many errors 
		//HashMap<String, List<Website>> engine = new HashMap<String,List<Website>>(20);
		BufferedReader input;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ____      _             \r\n"
				+ "|  _ \\ ___| |_ _ __ ___  \r\n"
				+ "| |_) / _ \\ __| '__/ _ \\ \r\n"
				+ "|  _ <  __/ |_| | | (_) |\r\n"
				+ "|_| \\_\\___|\\__|_|  \\___/ ");
		System.out.println("Type to Search:");
		try{
			 input = new BufferedReader(new FileReader("C:\\TestData\\TestFile.txt"));
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.out.println("Unable to read test file C:\\TestData\\TestFile.txt");
			return;
		}	 
	
		try{
			 String webSiteURL;
			 String webSiteDescription;
			 String[] webSiteKeywords = new String[20];
		
			 String str;
			 while ((str = input.readLine()) != null) {
				 String[] tokens=str.split(",");
				 if (tokens.length>2)
				    {
				    webSiteURL = tokens[0];
				    webSiteDescription = tokens[1];				 
				    //System.out.printf("%nSite %s%n",webSiteURL);
				   // System.out.printf("Description %s%n",webSiteDescription);
				  /* System.out.println("Key Words:");*/
				   
				    //List<Website> website = new ArrayList<Website>(webSiteURL,webSiteDescription);				 
				    Website website = new Website(webSiteURL,webSiteDescription);
				    //System.out.println(tokens[2]);
				   			for (int i=2;i<tokens.length; i++) 							   				  
				    		engine.put(tokens[i].trim(),website);				 				    				   				    				  
			 
			 }
			 	//System.out.println(engine);
			 	String key = scanner.next();
				Website s = (Website) engine.get(key); 
			   if(s != null)		    	
			    System.out.printf("%s %s %n",  s.getUrl(), s.getDescription());
			    else {
			    	System.out.println("No Websites Found"); 
			    } 
			    	
			 }
		}
	    catch (IOException ioException){
	    	System.out.println("Unable to read test file C:\\TestData\\TestFile.txt");
	    }
					
	}
}
