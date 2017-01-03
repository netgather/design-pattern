package com.neu.design.composite1;

import java.util.ArrayList;
import java.util.List;

public class Root implements Node {

	private List<Node> nodes;
	public Root() {
		nodes = new ArrayList<Node>();
	}
	
	public void save(Node node){
		nodes.add(node);
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
	public int getSize(){
		return nodes.size();
	}
	@Override
	public void operation() {
		System.out.println("���ڵ�");
		for(Node node : nodes){
			node.operation();
		}
	}
}
