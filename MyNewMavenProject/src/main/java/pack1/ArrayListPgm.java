package pack1;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPgm {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Anna");
		al.add("Jain");
		al.add("Ben");
		System.out.println(al);
		Iterator<String> itr=al.iterator();//arraylist--->itr
		while(itr.hasNext()) //true or false, return true
		{
			String s=itr.next();
			System.out.println(s);
			
		}
		String get_elmt=al.get(2);
		System.out.println(get_elmt);
		Boolean b=al.contains("Anna");
		System.out.println(b);
		int length=al.size();
		System.out.println(length);
		al.remove(1);
		System.out.println(al);
		//for-each
		for(String s:al)
		{
			System.out.println(s);
		}
		int a[]= {10,25,30,35};
		for(int i:a)
		{
			System.out.println(i);
		}
		
		}
		

	}


