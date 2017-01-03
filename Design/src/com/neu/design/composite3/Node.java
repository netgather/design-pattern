package com.neu.design.composite3;

public interface Node extends Iterable<Node> {

	
	public Node save(Node node);
	public Node remove(int index);
	public void clear();
	public void operator();
}
