package com.neu.design.composite5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Root extends Node {

	private List<Node> sons = null;
	public Root() {
		sons = new ArrayList<Node>();
	}
	@Override
	public Iterator<Node> iterator() {
		return this.sons.iterator();
	}
	@Override
	public Node saveSonNode(Node node) {
		sons.add(node);
		node.setParentNode(this);
		return this;
	}
	@Override
	public Node getSonNode(int index) {
		return sons.get(index);
	}
	
	@Override
	public void removeSonNode(int index) {
		Node son = sons.remove(index);
		son.removeParentNode();
	}
	@Override
	public void clearSonNode() {
		for(Node node:this){
			node.removeParentNode();
		}
	}
	@Override
	public void operation() {
		System.out.println("���ڵ�");
		for(Node node : sons){
			node.operation();
		}
	}
}
