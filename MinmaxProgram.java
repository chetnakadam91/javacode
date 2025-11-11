
public class MinmaxProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=30;
		a[2]=15;
		a[3]=70;
		a[4]=25;
		int min=a[0],max=a[0], i;
		for (i = 1; i < a.length; i++) 
		{
            if (a[i] < min)
            {
                min = a[i];
            }
            if (a[i] > max) 
            {
                max = a[i];
            }
        }
		 System.out.println("Smallest number: " + min);
	     System.out.println("Greatest number: " + max);
	}

}
