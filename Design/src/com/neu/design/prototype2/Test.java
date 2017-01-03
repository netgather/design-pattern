package com.neu.design.prototype2;

import java.util.ArrayList;
import java.util.List;


public class Test {

	@org.junit.Test
	public void test() throws CloneNotSupportedException {
		
		D d1 = new D(20,new StringBuffer("aaa"));
		D d2 = new D(20,new StringBuffer("bbb"));
		D d3 = new D(20,new StringBuffer("ccc"));
		D d4 = new D(20,new StringBuffer("ddd"));
		D d5 = new D(20,new StringBuffer("eee"));
		
		List<D> list = new ArrayList<D>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		A a = new A(new B(new C(1001)),list);
		A aClone = a.clone();
	
		
		
		System.out.println("****a");
		StringBuffer aName = a.getList().get(1).getName();
		System.out.println(aName);
		System.out.println("**���ú�");
		a.getList().get(1).setName(new StringBuffer("zzz"));
		StringBuffer aName2 = a.getList().get(1).getName();
		System.out.println(aName2);
		
		System.out.println("****aClone");
		StringBuffer aCloneName = aClone.getList().get(1).getName();
		System.out.println(aCloneName);
	}
}