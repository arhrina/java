
public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		int count=0, sum=0, mul=0;
		for(count=0;count<10;count++)
		{
			sum=sum+count;
			if(count>=1)
			{
				mul=count*count;
				System.out.println(mul);
			}
			
		}
		System.out.println(sum);
		
	}

}
