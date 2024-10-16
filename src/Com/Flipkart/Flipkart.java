package Com.Flipkart;

import Com.customexp.OtpNotMatch;

public class Flipkart {
	
	public void OtpEnter(int otp)   {
		if(otp == 12345) {
			System.out.println("OTP Match...");
		
		}else {
			
			
			//System.out.println("not ch.");
			throw new OtpNotMatch("OTP Does Not Match....");
			
		}  
	}
	
	



}
