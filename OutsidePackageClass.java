
public class OutsidePackageClass {
protected OutsidePackageClass(int a) {
    	
        System.out.println("constructor-Protected access specifier");
    }
    public void method1()
    {
    	 System.out.println("non static method-public access specifier");
    }
    private void method2()
    {
    	System.out.println("non static method-private");
    }
    public static void staticMethod()
    {
    	 System.out.println("static method");
    	
    }
   static void method3()
    {
    	System.out.println("default access specifier- method");
    	
    	
    }
    void method4()
    {
    	System.out.println("default access specifier- method");
    	
    	
    }

}
