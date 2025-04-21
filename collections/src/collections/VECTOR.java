package collections;
import java.util.*;
public class VECTOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector  obj=new Vector();
obj.addElement("Hello");
	obj.addElement("This is ");
	obj.addElement("Tiwari here");
	System.out.println(obj);
	System.out.println(obj.get(2));
	obj.removeElement("This is ");
	System.out.println(obj);
	}

}
