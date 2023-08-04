package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.util.MyList;

public class MyListTest {
		private MyList<Integer> mt;
	
		@Before
		public void setup() {
			mt=new MyList(Integer.class, 50);
		}
		
		@Test
		public void add2() {
			Assert.assertTrue(mt.add(10));
				
		}
		@Test
		public void add() {
			Assert.assertTrue(mt.add(10));
			Assert.assertEquals(1, mt.size());
			
		}
		@Test
		public void add1() {
			mt.add(10);
			mt.add(10);
			mt.add(10);
			Assert.assertEquals(3, mt.size());
			
		}
		@Test
		public void remove() {
			mt.add(11);
			mt.add(20);
			mt.add(10);
			mt.add(40);
			mt.remove(10);
			Assert.assertEquals(2, mt.size());
			
		}
}
