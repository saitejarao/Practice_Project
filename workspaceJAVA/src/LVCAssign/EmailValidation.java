package LVCAssign;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation 
{
	public static void main(String[] args) {
		String[] strArray = { "heademployee@email.com", "staffemployee@email.com", "maintainanceemployee@email.com", "companyempemail.org", "employee@email.co.in" };
        boolean found = false;
        int index = 0;
        
        System.out.println("Enter a email id:");
        Scanner sc1=new Scanner(System.in);
		String searchStr=sc1.next();
		
        
       for (int i = 0; i <strArray.length; i++) {
       if(searchStr.equals(strArray[i])) {
            index = i; found = true; 
            break;
            }
        }
       if(found)
          System.out.println(searchStr +" found at the index "+index+" in the Employees email ids list ");
        else
          System.out.println(searchStr +" not found in the array");	
	}
}