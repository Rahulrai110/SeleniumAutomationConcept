package corejavaconcept;

public class AustralianTraffic implements CentralInterface,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralInterface a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		
		AustralianTraffic at=new AustralianTraffic();
		at.walkonsymbol();
		
		ContinentalTraffic ct = new AustralianTraffic();
		ct.Zebracrossing();
		
	/*	ContinentalTraffic ct = new AustralianTraffic();
		ct.Zebracrossing();*/
	}

	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implemetation");
	}

	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Redstop Implemetation");
	}
	
	public void walkonsymbol()
	{
		System.out.println("Walk on red symbol");
	}

	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow Implemetation");
	}

	public void Zebracrossing() {
		// TODO Auto-generated method stub
		System.out.println("User Zebra crossing to walk");
	}

}
