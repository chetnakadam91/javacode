import java.util.Scanner;

public class ArrayProgram {
	
	public static void main(String args[])
	{
	int i = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int size=sc.nextInt();
	int a[]=new int [size];
	int b[]=new int[size];
	
	System.out.println("Enter Array elements=>");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	    
	}
	System.out.println("Array elements are=>");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	
		
	}
	System.out.println("Array elements copy from array a into b array are=>");
	for(i=0;i<b.length;i++)
	{
		
		b[i]=a[i];
		System.out.println(b[i]);
	}
	
	}
	

}
