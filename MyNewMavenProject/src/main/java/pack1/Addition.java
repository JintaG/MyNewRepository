package pack1;

public class Addition {

	public static void main(String[] args) {
		try
		{
			int v=100/0; //infinity
			System.out.println(v);
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);

	}

}
