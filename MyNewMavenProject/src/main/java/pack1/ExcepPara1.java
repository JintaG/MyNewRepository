package pack1;

public class ExcepPara1 {

	public static void main(String[] args) {
		int balance=3000;
		int withdraw=4000;
		if(withdraw>balance)
		{
			try
			{
				throw new MyExcepPara("Insufficient balance");
			}
			catch (Exception e)
			{
				System.out.println("Exception Handled");
			}
		}
	}

}


	
