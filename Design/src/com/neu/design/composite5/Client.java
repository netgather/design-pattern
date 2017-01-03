package com.neu.design.composite5;

import com.neu.design.composite5.Leaf;
import com.neu.design.composite5.Root;

public class Client {

	public static void main(String[] args) {
		Root A = new Root();
		Root B = new Root();
		Leaf a = new Leaf();
		Leaf b = new Leaf();
		Leaf c = new Leaf();
		
		A.saveSonNode(B).saveSonNode(a);
		B.saveSonNode(b).saveSonNode(c);
		A.operation();
		System.out.println(B.getParentNode());
	}

}
