package Array;

import java.util.*;

public class LeftRotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		System.out.println(l);
		//Collections.rotate(l,3);//right rotate
		Collections.rotate(l,-3);//left rotate
		System.out.println(l);
		
		

	}

}
