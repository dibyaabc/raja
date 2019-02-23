package javatxtfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class datreadline {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("G:\\name.txt");
		BufferedReader br=new BufferedReader(fr);
	   boolean data;
		while(data=br.readLine()!=null)
		{
			System.out.println("data");
		}
	}

}
