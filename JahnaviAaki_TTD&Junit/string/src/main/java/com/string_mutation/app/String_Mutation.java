package com.string_mutation.app;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class String_Mutation
{
	public static void main(String args[])
	{
		final Logger log=LogManager.getLogger(String_Mutation.class);
		log.info("Enter a string:");
		Scanner scanner=new Scanner(System.in);
		String my_string=scanner.next();
		my_string=my_string.toUpperCase();
		boolean flag=true;
		for(int l=0;l<my_string.length();l++)
		{
		    char my_character=string.charAt(l);
		    if(!(my_character>='A' && my_character<='Z'))
		    {
                	flag=false;
		        break;
		    }
		}
		if(flag==true)
		{
		  	if(my_string.length()>=2)
		  	{
		    		String my_string1="";
		    		for(int i=0;i<=1;i++)
		    		{
		        		my_string1=my_string1+my_string.charAt(i);
		    		}
		    		String my_string2=""; 
		    		for(int i=2;i<my_string.length();i++)
		    		{
		        		my_string2=my_string2+my_string.charAt(i);
		    		}
				if(my_string1.contains("A"))
					my_string1=my_string1.replace("A","");
				log.info("\""+(my_string1+my_string2)+"\"");
		  	}
		  	else if(my_string.length()<=1)
		  	{
				if(my_string.charAt(0)=='A')
				{	
					String string_single_char=""; 
					string_single_char=string_single_char.replace("A","");
					log.info("\""+string_single_char+"\"");
				}
				else
					log.info(my_string);
			}
		}
		else
			log.info("Try Again!!Enter a valid string");
	}
}