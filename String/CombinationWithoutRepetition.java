import java.util.*;
import java.io.*;
import java.math.*;

public class CombinationWithoutRepetition{
	public static void main(String[] args) {
		String s="abc";
		int len=s.length();
		int pow=(int)Math.pow(2,len);
        int counter=0;

        for(counter=1;counter<pow;counter++){
        	for(int i=0;i<len;i++){
        		if((counter & (1<<i))>0){
        			System.out.print(s.charAt(i));
        		}
        	}
        	System.out.println();
        }

        String  input = "lastName,dob,age,hobby,firstName\n" + 
                                  "Kasireddi,Thu May 06 00:00:00 IST 2010,2,Singing,Sriram\n" + 
                                  "Kasireddi,Mon Sep 06 00:00:00 IST 1982,29,Painting,Sudhakar";
                            
                //String TEST_XML_STRING =readFileToString("/home/margi/xmlJson1.xml");
                        System.out.println("inside database\n"+input);
                        String p="";
                        int count=0;
                        for(int i=0;i<input.length();i++)
                        {   
                              if(i==input.length()-1)break;
                                if(input.charAt(i)=='"'){count++;if(count%2==0){p=p+"\n";}continue;}
                                else{p=p+input.charAt(i);}
                                
                        }
                        System.out.println(p+"modified String");
           
            
	}
}