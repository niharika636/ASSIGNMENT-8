
import java.lang.*;
import java.util.*;
 class CountWord
{ 
	public static void main(String args[])
	{ 
                             
		System.out.println("Enter a string");
                  Scanner s1=new Scanner (System.in);
                         String str=s1.nextLine();
		int count = 1;
 
		for (int i = 0; i < str.length() - 1; i++)
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}