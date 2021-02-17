package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StringMan {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s="";
String s2=null;
System.out.println(s.length());
//System.out.println(s2.length());

String file="c://user://uma://text.docx";

FileInputStream i=new FileInputStream(file);
Properties prop=new Properties();

prop.load(i);

System.out.println(prop.getProperty("browser"));
	}
	
	

}
