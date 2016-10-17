package com.pita.tharedcommu;

public class CommonThread {
	 static int value;
	boolean isProduce=true;
	
	public synchronized void produce(int i){
		if(!isProduce){
			try {
				System.out.println("going to wait");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			value=i;
		    isProduce=false;
		    System.out.println("Producer thread produce="+i);
		    notify();
			
		}
	}
	public synchronized int consume(){
		if(isProduce){
			try {
				System.out.println("on consume wait");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
		}
		
		isProduce=true;
		notify();
		return value;
		
	}
	

}
