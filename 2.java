import java.util.Scanner;
class Substring{
	
void demo(){
            Scanner s = new Scanner(System.in);
	int count=0;
	System.out.println("Enter the string:");
	String str = s.nextLine();
	while(count<str.length()){
		System.out.print(str.charAt(count) + " ");
		count++;
	}
	for(int i=0;i<str.length();i++){
		for(int j=0;j<str.length();j++){
                                                     if(i>j){
			System.out.print(str.charAt(i));
			System.out.print(str.charAt(j) + " ");}
		}
		System.out.print(" ");
	}
	System.out.println(str);
}

	public static void main(String[] args) {
		Substring s = new Substring();
		s.demo();
	}
}