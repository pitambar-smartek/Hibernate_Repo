package com.pita.tharedcommu;

public class ProducerThread extends Thread{
	private CommonThread commonThread=null;
	
	public ProducerThread(CommonThread commonThread){
		this.commonThread=commonThread;
		
	}
	
	@Override
	public void run() {
		int i=0;
		while(true){
			
			synchronized (commonThread) {
				
			
			System.out.println("on producer thread");
			commonThread.produce(i);
			i=i+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	

}
