package com.neu.design.composite4;


public abstract class Node implements Iterable<Node> {

	protected Node parentNode;
	public void addParentNode(Node parentNode){
		this.parentNode = parentNode;
	}
	public Node getParentNode(){
		if(this.parentNode!=null){
			return this.parentNode;
		}
		return null;
	}
	public void removeParentNode(){
		this.parentNode = null;
	}
	public abstract Node saveSonNode(Node node);
	public abstract Node removeSonNode(int index);
	public abstract void clearSonNode();
	public abstract void Operation();
}
