package intern;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		 try {
	            FileReader fr = new FileReader("C:\\Users\\admin\\OneDrive\\Desktop\\Git\\github.txt");
	            FileWriter fw = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\Git\\InternOutput.txt");
	            String str = "";
	 
	            int i;
	            while ((i = fr.read()) != -1) {
	                str += (char)i;
	            }
	
	            System.out.println(str);
	            fw.write(str);
	            fr.close();
	            fw.close();
	            System.out.println("File reading and writing both done");
	        }
	
	        catch (IOException e) {
	            System.out.println("There are some IOException");
	        }
	    }
	}

