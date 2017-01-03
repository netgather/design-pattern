package com.neu.design.template;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		List<Object> list = new ArrayList<Object>();
		list.add("a");
		list.add("c");
		list.add("a");
		list.add("z");
		list.add("f");
		Template template = new TextTemplate();
		System.out.println(template.sort(list));
	}

}
