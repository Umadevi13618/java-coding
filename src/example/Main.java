package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public static class Main throws IOException
{
	      File file = new File("C:\\Users\\chevv\\eclipse-workspace\\vijay\\input.txt");
	      FileInputStream fn = new FileInputStream(file); 

	      InputStreamReader input = new InputStreamReader(fn); 
	      BufferedReader reader = new BufferedReader(input);
	 
	      String sentence = null;
	      Main m=new Main();
	      FileWriter writer = new FileWriter("C:\\Users\\chevv\\eclipse-workspace\\vijay\\output.txt", true);
	      BufferedWriter bufferedWriter = new BufferedWriter(writer);
          bufferedWriter.write(m.process(sentence,reader));
          System.out.println("hello");
          

	 }
	int process(String sentence, BufferedReader reader) throws IOException
	{
	      int countWord = 0,whitespaceCount = 0;
	      if((sentence= reader.readLine()) != null)
	 {
	         String[] wordlist = sentence.split("\\s+"); 
	         countWord += wordlist.length;
	         whitespaceCount += countWord -1;
	      }
	       return whitespaceCount;
	}

	

}
