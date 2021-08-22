package com.revature.BloodBankApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bloodbank.controller.BloodBankController;
import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;
import junit.framework.TestCase;

public class BloodBankDAOImplTest extends TestCase {

	public void testAddBloodBankCenter() {
		//fail("Not yet implemented");
	}

	public void testDelBloodBankCenter() {
       //fail("Not yet implemented");
	}

	public void testGetAllBloodBankCenter() {
		boolean flag=false;
		List<BloodBankCenter> blist=new ArrayList<BloodBankCenter>();
		try {
			Connection con=DBUtil.getConnection();
			Statement pst=con.createStatement();
			ResultSet rs=pst.executeQuery("select * from BloodBankCenter");
			if(rs.next())
				flag=true;	
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(flag);
	}
	public void testGetBloodBankCenterbyId() {
		//fail("Not yet implemented");
}
}
