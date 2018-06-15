import java .util.*;
class ReverseString{
public static void main(String a[])
{
String str,rev_str="";
System.out.println("Enter a string");
Scanner s1=new Scanner (System.in);
str=s1.nextLine();
int l = str.length();
 
    for ( int i = l - 1 ; i >= 0 ; i-- )
         rev_str+=str.charAt(i);
      System.out.println("Reverse of string is: "+rev_str);
   }
}