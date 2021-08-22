package com.revature.bloodbank.dao;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.bloodbank.model.BloodBankCenter;
public interface BloodBankDAO {
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void delBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void updateBloodBankCenter(BloodBankCenter bloodBankCenter);
	public List <BloodBankCenter> getAllBloodBankCenter();
	public BloodBankCenter getBloodBankCenterbyId(Integer id);
}