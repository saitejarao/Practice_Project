package LVCAssign;
import java.io.FileReader;
import java.io.FileWriter;

public class Filehandling1 {

	public static void main(String[] args) {
		 char[] array = new char[60];
		 String data = "This is the data in the output file";  
		    try {
		      
		      FileWriter w=new FileWriter("C://Users//simplilearn//test.txt");
		      FileReader input = new FileReader("C://Users//simplilearn//test.txt");
		      w.write(data);
		      input.read(array);
		      
			  System.out.println("Data is written to the file.");
		      System.out.println("Data in the file:");
		      System.out.println(array);
		      
		      StringBuffer str=new StringBuffer("Iam the String");
		      str.append(" Iam only the String");
		      
		     System.out.println(str);
		      w.close();
		      input.close();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }
	}
}
