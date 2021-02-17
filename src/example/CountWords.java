package example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountWords {

 public static void main(String[] args) throws IOException {
		 usingScanner();
		 } 
 public static void usingScanner() throws IOException {
		 String filePath = "C:\\Users\\chevv\\eclipse-workspace\\vijay\\src\\input.txt";
		 // initialize scanner for reading file
		 Scanner fileReader = new Scanner(new FileInputStream(filePath));
		 // variable for holding word count
		 int wordCount = 0;
		 // iterate over lines
		 while(fileReader.hasNext()){
		 // read a line word by word
		 fileReader.next();
		 wordCount++;
		 }
		 // close scanner
		 fileReader.close();
		 System.out.println("Number of words in the file is: " + wordCount);
		 }
		}