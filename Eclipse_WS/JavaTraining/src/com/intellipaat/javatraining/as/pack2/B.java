package com.intellipaat.javatraining.as.pack2;

import com.intellipaat.javatraining.as.pack1.A;

public class B extends A
{
		public static void main(String[] args) {
			
			B a = new B();
			//System.out.println(a.privateVariable);
			//System.out.println(a.defaultValue);
			System.out.println(a.protectedVariable);
			System.out.println(a.publicVariable);
			
			//a.test1();
			//a.test2();
			a.test3();
			a.test4();
		}
}
