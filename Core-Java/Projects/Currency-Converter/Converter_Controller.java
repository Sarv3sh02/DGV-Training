package currency_converter;

public class Converter_Controller {
	
	public void convertUSD(double amount, int curChoice) {
		if(curChoice==2) {
			System.out.println("Your USD converted to UD is "+ amount*3.67);
		}
		else if(curChoice==3) {
			System.out.println("Your USD converted to RR is "+ amount*61.41);
		}
		else if(curChoice==4) {
			System.out.println("Your USD converted to AUD is "+ amount*1.61);
		}
		else if(curChoice==5) {
			System.out.println("Your USD converted to INR is "+ amount*83);
		}
		else System.out.println("You entered the wrond name");
		
	}
	
	public void convertDirham(double amount, int curChoice) {
		if(curChoice==1) {
			System.out.println("Your UD converted to USD is "+ amount*0.27);
		}
		else if(curChoice==3) {
			System.out.println("Your UD converted to RR is "+ amount*16.72);
		}
		else if(curChoice==4) {
			System.out.println("Your UD converted to AUD is "+ amount*0.44);
		}
		else if(curChoice==5) {
			System.out.println("Your UD converted to INR is "+ amount*22.61);
		}
		else System.out.println("You entered the wrond name");
		
	}
	
	public void convertRuble(double amount, int curChoice) {
		if(curChoice==1) {
			System.out.println("Your RR converted to USD is "+ amount*0.016);
		}
		else if(curChoice==2) {
			System.out.println("Your RR converted to UD is "+ amount*0.6);
		}
		else if(curChoice==4) {
			System.out.println("Your RR converted to AUD is "+ amount*0.026);
		}
		else if(curChoice==5) {
			System.out.println("Your RR converted to INR is "+ amount*1.35);
		}
		else System.out.println("You entered the wrond name");
		
	}
	
	public void convertAusDol(double amount, int curChoice) {
		if(curChoice==1) {
			System.out.println("Your AUD converted to USD is "+ amount*0.62);
		}
		else if(curChoice==2) {
			System.out.println("Your AUD converted to UD is "+ amount*2.28);
		}
		else if(curChoice==3) {
			System.out.println("Your AUD converted to RR is "+ amount*38.27);
		}
		else if(curChoice==5) {
			System.out.println("Your AUD converted to INR is "+ amount*51.6);
		}
		else System.out.println("You entered the wrond name");
		
	}
	
	public void convertINR(double amount, int curChoice) {
		if(curChoice==1) {
			System.out.println("Your INR converted to USD is "+ amount*0.012);
		}
		else if(curChoice==2) {
			System.out.println("Your INR converted to UD is "+ amount*0.044);
		}
		else if(curChoice==3) {
			System.out.println("Your INR converted to RR is "+ amount*0.74);
		}
		else if(curChoice==4) {
			System.out.println("Your INR converted to AUD is "+ amount*0.019);
		}
		else System.out.println("You entered the wrond name");
		
	}
	

}
