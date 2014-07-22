package util;
import java.io.*;


public class StampaUtenti {
	 public static void main(String args[])
			  throws IOException {
			    FileReader f= new FileReader("username-password.txt");
			    BufferedReader b =  new BufferedReader(f);
			 
			    String s=b.readLine();
			   
			    
			    String[] token = s.split("/"); 
			    
			    for(int i=0; i<token.length; i++){
			             System.out.println("username= "+ i + ")" );
			          System.out.print("password=" + token[i]); 
			        //  System.out.print("\n"); 
			    }			    
			    System.out.println(s);
			  }

	
			}

