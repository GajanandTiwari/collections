package collections;
import java.util.*;
public class iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList obj= new ArrayList();
obj.add("the");
obj.add("nature");
obj.add("is beautiful");
ListIterator ij =obj.listIterator();
int i=0;
while(ij.hasNext())
	{
	Object o=ij.next();
	System.out.println(o);
	

	}
while(ij.hasPrevious()) {
	Object p=ij.previous();
	System.out.println(p);
}

}
}
