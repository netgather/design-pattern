package com.neu.design.composite5;

import java.util.ArrayList;
import java.util.Iterator;

public class Leaf extends Node {

	@Override
	public Iterator<Node> iterator() {
		return new ArrayList<Node>().iterator();
	}
	@Override
	public Node saveSonNode(Node node) {
		throw new RuntimeException("Ҷ�ڵ�"+this.getClass().getName()+"���������ӽڵ�");
	}
	@Override
	public Node getSonNode(int index) {
		throw new RuntimeException("Ҷ�ڵ�"+this.getClass().getName()+"û���ӽڵ�");
	}
	@Override
	public void removeSonNode(int index) {
		throw new RuntimeException("Ҷ�ڵ�"+this.getClass().getName()+"û���ӽڵ�");
	}
	@Override
	public void clearSonNode() {}
	@Override
	public void operation() {
		System.out.println("�ӽڵ�");
	}
}
