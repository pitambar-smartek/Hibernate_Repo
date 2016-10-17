
	
	
	package com.pita.tharedcommu;

	public class ConsumerThread extends Thread{
		private CommonThread commonThread=null;
		
		public ConsumerThread(CommonThread commonThread){
			this.commonThread=commonThread;
			
		}
		
		@Override
		public void run() {
			
			while(true){
				synchronized (commonThread) {
				int i=commonThread.consume();
				System.out.println("consumer thread consume="+i);
				}
				
				
			}
		}
		

	}



