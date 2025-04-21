package collections;
import  java.util.*;
public class Enumaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
v.addElement("T");
v.addElement("i");
v.addElement("w");
v.addElement("a");
v.addElement("r");
v.addElement("i");
Enumeration em=v.elements();
int i=0;
while(em.hasMoreElements())
{
Object obj=em.nextElement();
System.out.println("next letter is"+" "+obj);
}i++;
	}

}
