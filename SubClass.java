
public class SubClass extends MyPrograms{
	
	public void show()
	{
		
		System.out.println("Subclass");
		super.show();
	}
	public static void main(String[] args) {
		SubClass a=new SubClass();
		a.show();
		

	}


}
