package com.revature.bloodbank.client;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;
import com.revature.bloodbank.controller.BloodBankController;
import com.revature.bloodbank.model.BloodBankCenter;
public class BloodbankApplication {
	static Logger logger = Logger.getLogger("BloodbankApplication.class");
	public static void main(String[] args) {
		BloodbankApplication ba=new BloodbankApplication();
		Scanner sc=new Scanner(System.in);
		int chioce;
		do {
			System.out.println("Enter your choice**");
			System.out.println("1.Insert BoodBankCenter Details");
			System.out.println("2.Delete BloodBankCenter Details");
			System.out.println("3.Update BloodBankCenter Details");
			System.out.println("4.Get All BloodBankCenter Details");
			System.out.println("5.Get BloodBankCenter By Id");
			System.out.println("6.Exit");
			chioce=sc.nextInt();
			switch(chioce) {
			case 1:
				ba.addBloodBankCenter();
				break;
			case 2:
				ba.delBloodBankCenter();
				break;
		    case 3:
				ba.updateBloodBankCenter();
				break;
		    case 4:
			    ba.getAllBloodBankCenter();
			    break;
			case 5:
				ba.getBloodBankCenterbyId();
				break;
			case 6:
				System.out.println("Exit");
				break;
			default:
				break; }
		    }
		while(chioce!=4); }
public static void addBloodBankCenter() {
		System.out.println(" BloodBank Application ");
		BloodBankController bcontroller=new BloodBankController();
		System.out.println("enter boold bank details");
		Scanner sc=new Scanner(System.in);
		BloodBankCenter bloodBankCenter=new  BloodBankCenter();
		logger.info("Entered in Client");
		System.out.println("Enter the Center Id:");
		int centerId=sc.nextInt();
		sc.nextLine();
		 System.out.println("Enter the Center Name:");
		 String centerName=sc.nextLine();
		 System.out.println("Enter the Street:");
		 String street=sc.nextLine();
		 System.out.println("Enter the City:");
		 String city=sc.nextLine();
		 System.out.println("Enter the State:");
		 String state=sc.nextLine();
		 System.out.println("Enter the Pincode:");
		 String pincode=sc.nextLine();
		 bloodBankCenter.setCenterId(centerId);
		 bloodBankCenter.setCenterName(centerName);
		 bloodBankCenter.setStreet(street);
		 bloodBankCenter.setCity(city);
		 bloodBankCenter.setState(state);
		 bloodBankCenter.setPincode(pincode);
		 bcontroller.addBloodBankCenter(bloodBankCenter);
		 System.out.println("Adding Blood bank ceneter is completed."); }
public void delBloodBankCenter() {
		logger.info("Entered in Client");
		System.out.println("Enter the center ID to delete:");
		BloodBankController bcontroller=new BloodBankController();
		Scanner sc=new Scanner(System.in);
		BloodBankCenter bloodBankCenter=new  BloodBankCenter();
		int centerId=sc.nextInt();
		bloodBankCenter.setCenterId(centerId);
		bcontroller.delBloodBankCenter(bloodBankCenter);
}
public void updateBloodBankCenter( ){
	 BloodBankController bcontroller=new BloodBankController();
	 logger.info("Entered in client");	                        
	System.out.println("enter boold bank details");
	Scanner sc=new Scanner(System.in);
	BloodBankCenter bloodBankCenter=new  BloodBankCenter();
	System.out.println("Enter the Center Id:");
	int centerId=sc.nextInt();
	 bloodBankCenter.setCenterId(centerId);
	 System.out.println("Enter the Center Name:");
	 String centerName=sc.next();;
	 bloodBankCenter.setCenterName(centerName);
	 System.out.println("Enter the Street:");
	 String street=sc.next();
	 bloodBankCenter.setStreet(street);
	 System.out.println("Enter the City:");
	 String city=sc.next();
	 bloodBankCenter.setCity(city);
	 System.out.println("Enter the State:");
	 String state=sc.next();
	 bloodBankCenter.setState(state);
	 System.out.println("Enter the Pincode:");
	 String pincode=sc.next();
	 bloodBankCenter.setPincode(pincode);
	 bcontroller.updateBloodBankCenter(bloodBankCenter);
}
public List <BloodBankCenter> getAllBloodBankCenter() {
    logger.info("Entered in Client");
    BloodBankController bcontroller=new BloodBankController();
	System.out.println("Displays All BloodBankCenter");
	System.out.println(bcontroller.getAllBloodBankCenter());
	List <BloodBankCenter> blist=bcontroller.getAllBloodBankCenter();
	return blist;
}
public BloodBankCenter getBloodBankCenterbyId( ) {
	logger.info("Entered in Client");
	System.out.println("Enter Center Id");
	BloodBankController bcontroller=new BloodBankController();
	Scanner sc=new Scanner (System.in);
	BloodBankCenter bloodBankCenter=new  BloodBankCenter();
	int centerId1=sc.nextInt();
	System.out.println(bcontroller.getBloodBankCenterbyId(centerId1));
	 System.out.println("Displaying Entered BloodBankCenter Center Id");
	return bloodBankCenter; }
}