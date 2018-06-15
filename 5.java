import java.util.*;
import java.lang.*;
 class Substring {


public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String s1 = input.next();
        System.out.print("Please enter a second String: ");
        String s2 = input.next();

    char str[]=s1.toCharArray();
    char search[]=s2.toCharArray();

int count1=s1.length();
int count2=s2.length();
    int i=0;
    int j=0;
    int flag=0;
   for (i = 0; i <= count1 - count2; i++)
    {
        for (j = i; j < i + count2; j++)
        {
            flag = 1;
            if (str[j] != search[j - i])
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            break;
    }
    if (flag == 1)
     System.out.println("SEARCH SUCCESSFUL!");
    else
       System.out.println("SEARCH UNSUCCESSFUL!");
    }

 }