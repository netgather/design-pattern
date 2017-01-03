package com.neu.design.composite1;

public class Client {

	public static void main(String[] args) {
		Root A = new Root();
		Root B = new Root();
		Leaf a = new Leaf();
		Leaf b = new Leaf();
		Leaf c = new Leaf();
		
		A.save(B);
		A.save(a);
		B.save(b);
		B.save(c);
		A.operation();
	}

}
