package com.neu.design.composite4;

import java.util.ArrayList;
import java.util.Iterator;

public class Leaf extends Node {

	@Override
	public Iterator<Node> iterator() {
		return new ArrayList<Node>().iterator();
	}
	@Override
	public Node saveSonNode(Node node) {
		return null;
	}
	@Override
	public Node removeSonNode(int index) {
		return null;
	}
	@Override
	public void clearSonNode() {}
	@Override
	public void Operation() {
		System.out.println("�ӽڵ�");
	}
}
