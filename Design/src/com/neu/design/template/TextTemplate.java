package com.neu.design.template;

public class TextTemplate extends Template implements SystemConstant{

	@Override
	protected boolean sortType() {
		return asc;
	}

	@Override
	protected boolean compareType(Object former, Object later) {
		return former.toString().compareToIgnoreCase(later.toString())<0;
	}
}
