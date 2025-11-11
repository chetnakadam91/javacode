import java.util.Scanner;

public class ReverseStringProgram{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string which you want to reverse=>");
	    String str=sc.next();
		String rev="";
		int i;
		for(i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	    System.out.println("Reverse String is=>"+rev);
		if(str.equals(rev))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not Pallindrome");
		}

	}

	

}
