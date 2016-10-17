package com.thread;

class SyThread1 extends Thread {
	Abc a1;

	public SyThread1(Abc a1) {
		// TODO Auto-generated constructor stub
		this.a1 = a1;
	}

	public void run() {
		a1.funA();
	}

}

class SyThread2 extends Thread {
	Abc a1;

	public SyThread2(Abc a1) {
		// TODO Auto-generated constructor stub
		this.a1 = a1;
	}

	public void run() {
		a1.funA();
	}

}

class SyThread3 extends Thread {
	Abc a1;

	public SyThread3(Abc a1) {
		// TODO Auto-generated constructor stub
		this.a1 = a1;
	}

	public void run() {
		a1.funA();
	}

}

public class Demo {
	public static void main(String pita[]) {
		Abc a1 = new Abc("VB.net","vb.netOne","vb.netTwo","vb.netThree");
		/*Abc a2=new Abc("C++","c++One","c++Two","c++Three");
		Abc a3=new Abc("java","javaOne","javatwo","javathree");*/
		
		SyThread1 t1 = new SyThread1(a1);
		SyThread2 t2 = new SyThread2(a1);
		SyThread3 t3 = new SyThread3(a1);

		t1.start();
		t2.start();
		t3.start();
	}

}
