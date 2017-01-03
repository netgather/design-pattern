package com.neu.design.composite3;

import java.util.Iterator;

import com.neu.design.composite3.Node;

public class Leaf implements Node {

	@Override
	public Iterator<Node> iterator() {
		return null;
	}
	@Override
	public Node save(Node node) {
		return null;
	}
	@Override
	public Node remove(int index) {
		return null;
	}
	@Override
	public void clear() {}
	@Override
	public void operator() {
		System.out.println("Ҷ�ڵ�");
	}
}
