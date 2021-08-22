package com.revature.bloodbank.service;
import java.util.List;
import com.revature.bloodbank.model.BloodBankCenter;
public interface BloodBankService {
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void delBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void updateBloodBankCenter(BloodBankCenter bloodBankCenter);
	public List<BloodBankCenter> getAllBloodBankCenter();
	public BloodBankCenter getBloodBankCenterbyId(Integer id);
}