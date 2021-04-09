import java.util.stream.IntStream;

@FunctionalInterface
interface A
{
	void show();
}

public class LambdaPractice {

	public static void main(String[] args) 
	{
	
		/*
		 * A obj; obj=()-> { System.out.println("whq"); }; obj.show();
		 */
		
		
		  A obj; obj=()->System.out.println("hello");
		 
		  obj.show();
		 
		
		IntStream.range(1,10).forEach(System.out::print);
		
	}

}
