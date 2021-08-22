package com.revature.bloodbank.service;
import java.util.List;
import org.apache.log4j.Logger;
import com.revature.bloodbank.dao.BloodBankDAO;
import com.revature.bloodbank.dao.BloodBankDAOImpl;
import com.revature.bloodbank.model.BloodBankCenter;
public class BloodBankServiceImpl implements BloodBankService{
	static Logger logger = Logger.getLogger("BloodBankSeviceImpl.class");
	BloodBankDAO bloodBankDaoImpl=new BloodBankDAOImpl();
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
	logger.info("in service add method");
		try {
			
			bloodBankDaoImpl.addBloodBankCenter(bloodBankCenter); } 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delBloodBankCenter(BloodBankCenter bloodBankCenter) {
	logger.info("in service delete method");
		try {
			bloodBankDaoImpl.delBloodBankCenter(bloodBankCenter);} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updateBloodBankCenter(BloodBankCenter bloodBankCenter) {
		logger.info("in service update method");
		try {
			bloodBankDaoImpl.updateBloodBankCenter(bloodBankCenter); }
		catch (Exception e){
			e.printStackTrace(); }
	}
	public List<BloodBankCenter> getAllBloodBankCenter(){
		logger.info("in service getAll method");
		return bloodBankDaoImpl.getAllBloodBankCenter();
	}
	public BloodBankCenter getBloodBankCenterbyId(Integer id) {
		logger.info("in service getCenterId method");
		return bloodBankDaoImpl.getBloodBankCenterbyId(id);
	}
}