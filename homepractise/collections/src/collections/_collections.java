package collections;

import java.util.List;
import java.util.Vector;

public class _collections {

	public static void main(String[] args) {		
		//it is used for to handle multiple threads
		//default capacity is 10
		//intial capacity is 10
		//it allows duplicate values
		//it allow null values
		//it maintains insertion order
		//it does not maintain sorted order
		//it is synchronized
		List<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v);
		System.out.println(v.contains(1));
		System.out.println(v.set(0, 3));
		System.out.println(v);
		v.remove(2);
	System.out.println(v);
	System.out.println(v);

	}

}
