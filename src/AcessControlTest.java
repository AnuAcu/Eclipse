
public class AcessControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessControlDemo obj1= new AcessControlDemo();
		
		obj1.a=10;
		obj1.b=20;
		obj1.setC(30);
		
		System.out.println("Value of a:"+ obj1.a);
		System.out.println("Value of b:"+ obj1.b);
		System.out.println("Value of c:"+ obj1.getC());
		
		//when a member of class is public then it is accessed by any other code
		//if private then it cannot be accessed by other classes or subclasses
		//it can be accessed by only members of its class
		// protected is applied when inheritence is involved
	}

}
