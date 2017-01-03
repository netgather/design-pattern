package com.neu.design.responsibilitychain;

public class Demo31_1{
	
	public boolean isEqual(char[] src,char[] des){
						
					int length = src.length;
					for(int i=0;i<length;i++){
								char temp = src[0];
								for(int j=0;j<length-1;j++){
											  src[j] = src[j+1];
								}
								src[length-1] = temp;
								if(new String(src).equals(new String(des))){
												return true;
								}else{
									continue;
								}
					}
					return false;
	}
	public static void main(String[] args){
					Demo31_1 demo = new Demo31_1();
					char[] src = {'A','A','B','B','C','D'};
					char[] des = {'C','D','A','A'};
					System.out.println(demo.isEqual(src,des));
	}
}

