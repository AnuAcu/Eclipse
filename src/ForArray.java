
public class ForArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/* int month_days[];//type name of array[]
		    //month_days=new int [5];//name of array =new type [size]
				//when we use new keyword then only space will be allocated to array
		month_days[0] =10;//assigning values to array
		month_days[1] =20;
		month_days[2] =30;
		month_days[3] =40;
		month_days[4] =50;
		
		for(int i=0;i<=4;i++)
		{
		
		System.out.println( month_days[i] );

	    }
		*/
		
		int month_days[]= {10,20,30,40,50,60};
		for(int i=0;i<month_days.length;i=i+1)
		{
		
		System.out.println( month_days[i] );
		
	    }
		System.out.println( "NUmber of element in array " + month_days.length );
	}
	
}

