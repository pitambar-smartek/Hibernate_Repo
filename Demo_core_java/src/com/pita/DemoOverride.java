package com.pita;

public class DemoOverride {
	void punch()throws Exception{
		System.out.println("punching");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class DemoOver extends DemoOverride{
	@Override
	void punch() throws myExce {
		System.out.println("Ramiyana");
		
	}
	public static void main(String[] args) {
		DemoOverride ride=new DemoOver();
		try {
			ride.punch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class myExce extends Exception{
	
}
