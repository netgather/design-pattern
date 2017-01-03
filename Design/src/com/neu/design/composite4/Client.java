package com.neu.design.composite4;

import com.neu.design.composite4.Leaf;
import com.neu.design.composite4.Root;

public class Client {

	public static void main(String[] args) {
		Root A = new Root();
		Root B = new Root();
		Leaf a = new Leaf();
		Leaf b = new Leaf();
		Leaf c = new Leaf();
		
		A.saveSonNode(B).saveSonNode(a);
		B.saveSonNode(b).saveSonNode(c);

		B.addParentNode(A);
		//a.addParentNode(a);
		//b.addParentNode(B);
		//b.addParentNode(c);
		System.out.println(B.getParentNode());
	}

}
