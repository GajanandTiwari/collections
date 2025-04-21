package collections;
import java.util.*;
public class itrtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LINKEDLIST a=new LINKEDLIST();
		a.add("the");
		a.add("universe");
		a.add("is dust");
		System.out.println(a);
		Iterator ii=a.iterator();
		int i=0;   
		while(ii.hasNext())
		{
		Object obj=ii.next();
		if (i==0)
		{
			ii.remove();
			System.out.println("'the' is removed");
		}i++;
		}
		System.out.println(a);
	}

}
