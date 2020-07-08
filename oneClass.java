
public class oneClass
{
	public static void main(String[] args)
	{
		//loadaaaaaa();
		anotherClass a=new anotherClass();
	}
	
	static void loadaaaaaa()
	{
		try{
			Class.forName("anotherClass");
		}catch(ClassNotFoundException ex)
		{
			System.out.println("???");
		}
	}
}