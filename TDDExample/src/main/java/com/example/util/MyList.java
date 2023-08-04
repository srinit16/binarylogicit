package com.example.util;

import java.lang.reflect.Array;

public class MyList<T> {
		private T[] list;
		private int index;
		public MyList(Class<T> cla, int length) {
			index=-1;
			list=(T[]) Array.newInstance(cla, length);
			
		}
		
		public boolean add(T t) {
			list[++index]=t;
			return true;
		}
		
		public int size() {
			return this.index+1;
		}
		
		public void remove(T value) {
//			for(int x=0;x<size();x++) {
//				if(value==list[x]) {
//					
//				}
//			}
		}

}
