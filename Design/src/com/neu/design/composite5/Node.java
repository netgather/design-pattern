package com.neu.design.composite5;

public abstract class Node implements Iterable<Node> {

	protected Node parentNode;
	protected void setParentNode(Node parentNode){
		this.parentNode = parentNode;
	}
	protected Node getParentNode(){
		if(this.parentNode!=null){
			return this.parentNode;
		}else{
			throw new RuntimeException(this.getClass().getName()+"û�и��ڵ�");
		}
	}
	protected void removeParentNode(){
		if(this.parentNode==null){
			return ;
		}
		this.parentNode = null;
	}
	public abstract Node saveSonNode(Node node);
	public abstract Node getSonNode(int index);
	public abstract void removeSonNode(int index);
	public abstract void clearSonNode();
	public abstract void operation();
}
