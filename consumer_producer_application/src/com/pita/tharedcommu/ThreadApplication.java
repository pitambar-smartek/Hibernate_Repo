package com.pita.tharedcommu;

public class ThreadApplication {
	public static void main(String[] args) {
		System.out.println("on mainmain method");
		CommonThread common=new CommonThread();
		ProducerThread t=new ProducerThread(common);
		ConsumerThread tOne=new ConsumerThread(common);
		
		t.start();
		tOne.start();
	}

}
