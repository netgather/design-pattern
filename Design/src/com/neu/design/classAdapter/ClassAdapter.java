package com.neu.design.classAdapter;

public class ClassAdapter extends Adaptee implements Target{

	@Override
	public void targetFun() {
		super.adapteeFun();
	}
}
