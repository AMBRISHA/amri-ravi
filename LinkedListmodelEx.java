package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListmodelEx {
	public static void main(String[] args) {
		LinkedList <Emp1> List=new LinkedList <Emp1>();
		List.add(new Emp1("Tim",3000));
List.add(new Emp1("Rim",7000));
Collections.sort(List,new mysalary ());
System.out.println("sorted list");
for(Emp1 e:List)
{
	System.out.println(e);
}
}
}