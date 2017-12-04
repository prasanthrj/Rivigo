package org.riv.qa.test.wrap;

import org.testng.annotations.Test;

public class WrapTest {
	
	public String wrapText(String unwrappedText, int width) {

		String[] dict = unwrappedText.split(" "); // Gives me array of words to
	         									  // dictonary;
		String wrappedText = "";

		try {
			
		for ( int i = 0 ; i < dict.length ;i++)		
		{
			String newline = dict[i];	
			if( width < dict[i].length() )
			{
				System.out.println(dict[i].length());
				throw new Exception();	
			}	
		    while((newline+dict[i+1]).length()<width)
			{						
				i++;
				newline+=" "+dict[i];	
				
				if(i== dict.length-1)
					break;
			}
			
			wrappedText+= "\n"+newline;
		}	
		
		 return wrappedText;
	}
	catch (Exception e)
	{
		 //e.printStackTrace();
		 return "Page width too small to fit a word plz provide larger width";
	}
	}
	
	@Test
	public void testWrapTestSpacesLeading(){
		
		String wrapped = wrapText("     Maven 2 supports TestNG out of the box without the need to download any additional plugins Maven 2 supports TestNG out of the box without the need to download any additional plugins Maven 2 supports TestNG out of the box without the need to download", 18);
		System.out.println(wrapped);
	}
	
	@Test
	public void testWrapTestMinTextLength(){
		
		String wrapped = wrapText("     Maven 2 supports TestNG out of the box without the need to download any additional plugins Maven 2 supports TestNG out of the box without the need to download any additional plugins Maven 2 supports TestNG out of the box without the need to download", 4);
		System.out.println(wrapped);
	}


}
