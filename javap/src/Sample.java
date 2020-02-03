
class Stat
{
	public static  void  fun()
	{
		System.out.println("Static method is called");
	}
	
}
public class Sample {

	public static  void  main(String[] args)
	{
		Stat s=new Stat();
		s.fun();
	}

}
