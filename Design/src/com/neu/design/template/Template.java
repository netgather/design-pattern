package com.neu.design.template;

import java.util.List;

public abstract class Template {

	public final List<Object> sort(List<Object> array){
		int length = array.size();
		for(int i=0;i<length;i++){
			Object former = array.get(i);
			for(int j=i+1;j<length;j++){
				Object later = array.get(j);
				if(sortType()!=compareType(former,later)){
					array.set(i, later);
					array.set(j, former);
					former = later;
				}
			}
		}
		return array;
	}
	protected abstract boolean sortType();
	protected abstract boolean compareType(Object former,Object later);
}
