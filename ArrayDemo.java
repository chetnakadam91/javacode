import java.util.Arrays;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[10];
				
		a[0]=10;
		a[1]=30;
		a[2]=15;
		a[3]=70;
		a[4]=25;
		a[5]=60;
		a[6]=90;
		a[7]=215;
		a[8]=5;
		a[9]=40;
		int min=a[0],max=a[0], i,flag,temp;
		
		
		
	
	for(int j=0;j<a.length-1;j++)
	{
		flag=0;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
		  	temp=a[i];
		  	a[i]=a[i+1];
		  	a[i+1]=temp;
		  	
				
			
		  	
			}
			
			
		}
		 
	       
	}
	
	System.out.println(Arrays.toString(a));
	 System.out.println("Smallest number: " + min);
     System.out.println("Greatest number: " + max);
	
	}
}