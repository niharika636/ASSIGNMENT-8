import java.util.Scanner;
 class RemoveVowels{
                public static void main(String a[]) {
                       System.out.println("ENTER A STRING");
                      Scanner s1 = new Scanner(System.in);
                      String str = s1.nextLine();
                                
                                removevowels(str);
                }
                static void removevowels(String st) {
               char ch;
               String text="";
                                for(int i=0;i<st.length();i++)
                                         { ch=st.charAt(i);
              if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                continue;
                  text+=ch;
}
                     System.out.println(text);
                                
                }
}
