package com.neu.design.composite2;

import com.neu.design.composite2.Leaf;
import com.neu.design.composite2.Root;

public class Client {

	public static void main(String[] args) {
		Root A = new Root();
		Root B = new Root();
		Leaf a = new Leaf();
		Leaf b = new Leaf();
		Leaf c = new Leaf();
		A.save(a).save(B);
		B.save(b).save(c);
		A.operation();
	}

}
