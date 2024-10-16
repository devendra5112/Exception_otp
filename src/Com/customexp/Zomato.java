package Com.customexp;

public class Zomato {

	
	public void OtpEnter(int otp)   {
		if(otp == 1234) {
			System.out.println("Successful OTP...");
		
		}else {
			
			
			//System.out.println("not Successful..");
			throw new OtpNotMatch("Not Successful OTP ....");
			
		}  
	}
	
	

}
