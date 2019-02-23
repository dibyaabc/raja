package javatxtfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readdata {

	public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("G:\\name.txt");
	BufferedReader br=new BufferedReader(fr);
	String data=br.readLine();
	System.out.println("data");

	}

}
