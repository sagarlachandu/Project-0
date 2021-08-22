package com.revature.bloodbank.controller;
import java.util.List;

import org.apache.log4j.Logger;
import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.service.BloodBankService;
import com.revature.bloodbank.service.BloodBankServiceImpl;
public class BloodBankController {
	static Logger logger = Logger.getLogger("BloodBankController.class");
	BloodBankService bloodBankServiceImpl=new BloodBankServiceImpl();
	 public  void addBloodBankCenter(BloodBankCenter bloodBankCenter ) {
		logger.info("Entered in controller add");
		  try {
			bloodBankServiceImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			e.printStackTrace(); }
	   }
	 public  void delBloodBankCenter(BloodBankCenter bloodBankCenter) {
		 logger.info("Entered in controller del");
		  try {
			bloodBankServiceImpl.delBloodBankCenter(bloodBankCenter); } 
		  catch (Exception e) {
			e.printStackTrace(); }
	   }
	 public void updateBloodBankCenter(BloodBankCenter bloodBankCenter) {
		 logger.info("Entered in controller update");
		 try {
			 bloodBankServiceImpl.updateBloodBankCenter(bloodBankCenter); }
			 catch (Exception e) {
				 e.printStackTrace(); }
	 }
	 public List <BloodBankCenter> getAllBloodBankCenter(){
		 logger.info("Entered in controller getAll");
			return bloodBankServiceImpl.getAllBloodBankCenter(); 
			}
	 public BloodBankCenter getBloodBankCenterbyId(Integer id) {
		 logger.info("Entered in controller getCenterById");
			return bloodBankServiceImpl.getBloodBankCenterbyId(id);
	        }
	 }
