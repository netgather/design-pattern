package com.neu.design.composite4;

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
		return this;
	}
	@Override
	public Node removeSonNode(int index) {
		return sons.remove(index);
	}
	@Override
	public void clearSonNode() {
		sons.clear();
	}
	@Override
	public void Operation() {
		System.out.println("���ڵ�");
		for(Node node:sons){
			node.Operation();
		}
	}
}
