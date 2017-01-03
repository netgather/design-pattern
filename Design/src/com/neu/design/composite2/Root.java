package com.neu.design.composite2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Root implements Node, Iterable<Node> {

	public List<Node> nodes = null;
	public Root() {
		nodes = new ArrayList<Node>();
	}
	public Root save(Node node){
		nodes.add(node);
		return this;
	}
	public Node remove(int index){
		return nodes.remove(index);
	}
	public Node getNode(int index){
		return nodes.get(index);
	}
	public void clear(){
		nodes.clear();
	}
	@Override
	public Iterator<Node> iterator() {
		return this.nodes.iterator();
	}
	@Override
	public void operation() {
		System.out.println("���ڵ�");
		for(Node node : nodes){
			node.operation();
		}
	}
}
