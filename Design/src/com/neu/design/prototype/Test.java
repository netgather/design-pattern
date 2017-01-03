package com.neu.design.prototype;

import java.util.ArrayList;
import java.util.List;


public class Test {

	@org.junit.Test
	public void test() throws CloneNotSupportedException {
		
		D d1 = new D(20,"aaa");
		D d2 = new D(21,"bbb");
		D d3 = new D(22,"ccc");
		D d4 = new D(23,"ddd");
		D d5 = new D(24,"eee");
		
		List<D> list = new ArrayList<D>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		A a = new A(new B(new C(1001)),list);
		A aClone = a.clone();
		System.out.println("a:"+a);
		System.out.println("aClone:"+aClone);
		
		System.out.println("****");
		int aID = a.getB().getC().getId();
		System.out.println("aID:"+aID);
		a.getB().getC().setId(1002);
		System.out.println("**���ú�");
		int aID2 = a.getB().getC().getId();
		System.out.println("aID:"+aID2);
		System.out.println("****");
		
		
		int aCLoneID = aClone.getB().getC().getId();
		System.out.println("aCLoneID:"+aCLoneID);
		
		System.out.println("#######################");
		System.out.println("****");
		String aName = a.getList().get(1).getName();
		System.out.println(aName);
		System.out.println("**���ú�");
		a.getList().get(1).setName("zzz");
		String aName2 = a.getList().get(1).getName();
		System.out.println(aName2);
		
		System.out.println("****");
		String aCloneName = aClone.getList().get(1).getName();
		System.out.println(aCloneName);
		
	}

}