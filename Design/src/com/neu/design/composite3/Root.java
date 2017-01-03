package com.neu.design.composite3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Root implements Node {

	private List<Node> nodes = null;
	public Root() {
		nodes = new ArrayList<Node>();
	}
	@Override
	public Iterator<Node> iterator() {
		return this.nodes.iterator();
	}
	@Override
	public Node save(Node node) {
		nodes.add(node);
		return this;
	}
	@Override
	public Node remove(int index) {
		return nodes.remove(index);
	}
	@Override
	public void clear() {
		nodes.clear();
	}
	@Override
	public void operator() {
		System.out.println("���ڵ�");
		for(Node node:nodes){
			node.operator();
		}
	}
}
