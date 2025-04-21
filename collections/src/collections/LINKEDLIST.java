package collections;
import java.util.*;
public class LINKEDLIST extends LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LINKEDLIST obj=new LINKEDLIST();
obj.addFirst("people");
obj.addFirst("Hyderabadi");
obj.addFirst("hello");
//System.out.println(obj);
obj.addLast("this is ");
obj.addLast("Radio mirchi");
System.out.println(obj);
String st =(String)obj.getFirst();
System.out.println(st);
String sg=(String)obj.getLast();
System.out.println(sg);
obj.removeFirst();
obj.addFirst("Welcome");
System.out.println(obj);
obj.removeLast();
obj.addLast("KTR");
System.out.println(obj);
	}

}
