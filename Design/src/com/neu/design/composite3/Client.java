package com.neu.design.composite3;

import com.neu.design.composite3.Leaf;
import com.neu.design.composite3.Root;

public class Client {

	public static void main(String[] args) {
		Root A = new Root();
		Root B = new Root();
		Leaf a = new Leaf();
		Leaf b = new Leaf();
		Leaf c = new Leaf();
		A.save(B).save(a);
		B.save(b).save(c);
		A.operator();
	}

}
