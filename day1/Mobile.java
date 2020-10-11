package week1.day1;

public class Mobile {
	long mobileNumber = 7402166696L;
	float mobilePrice = 53000F;
	String mobileBrand = "OnePlus";
	boolean isFullCharge = true;


public void sendSms() {
	System.out.println("Send Sms");
}
public void takePhoto() {
	System.out.println("take photo");
}
public void makeCall() {
	System.out.println("Useed to make calls");
}
public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.sendSms();
	mob.takePhoto();
	mob.makeCall();
	
	System.out.println(mob.mobileNumber);
	System.out.println(mob.mobilePrice);
	System.out.println(mob.mobileBrand);
	System.out.println("whether its fully charged \n"+mob.isFullCharge);
}
}


