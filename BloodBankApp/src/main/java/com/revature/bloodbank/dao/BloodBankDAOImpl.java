package com.revature.bloodbank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;
public class BloodBankDAOImpl  implements BloodBankDAO{
	static Logger logger = Logger.getLogger("BloodBankDAOImpl.class");
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {	
		try {
			logger.info("Entered in DAOImpl add");
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into BloodBankCenter values(?,?,?,?,?,?)");
			pst.setInt(1, bloodBankCenter.getCenterId());
			pst.setString(2, bloodBankCenter.getCenterName());
			pst.setString(3, bloodBankCenter.getStreet());
			pst.setString(4, bloodBankCenter.getCity());
			pst.setString(5, bloodBankCenter.getState());
			pst.setString(6, bloodBankCenter.getPincode());
			pst.execute();
			System.out.println("data inserted..");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public void delBloodBankCenter(BloodBankCenter bloodBankCenter) {
	try {
		    logger.info("Entered in DAOImpl del");
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("delete from BloodBankCenter where centerId=?");
			pst.setInt(1, bloodBankCenter.getCenterId());
			int x=pst.executeUpdate();
			pst.close();
			con.close();
			if(x==1) {
				System.out.println("Record deleted..");
			}
			else
			{
				System.out.println("No Record found.");
			}
		}
		catch(Exception e) {
			
		}
	}
	public void updateBloodBankCenter(BloodBankCenter bloodBankCenter) {
		try {
			    Connection con=DBUtil.getConnection();
				String str="update BloodBankCenter set centerName=?,street=?,city=?,state=?,pincode=? where centerId=?";
				PreparedStatement pst=con.prepareStatement(str);
				pst.setString(1, bloodBankCenter.getCenterName());
				pst.setString(2, bloodBankCenter.getStreet());
				pst.setString(3, bloodBankCenter.getCity());
				pst.setString(4, bloodBankCenter.getState());
				pst.setString(5, bloodBankCenter.getPincode());
				pst.setInt(6, bloodBankCenter.getCenterId());
				int x=pst.executeUpdate();
				pst.close();
				con.close();
				if(x==1) {
					System.out.println("Record updated..");
				}
				else
				{
					System.out.println("No Record found.");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
public List<BloodBankCenter>  getAllBloodBankCenter() {
		List<BloodBankCenter> blist=new ArrayList<BloodBankCenter>();
		try {
			Connection con=DBUtil.getConnection();
			Statement pst=con.createStatement();
			ResultSet rs=pst.executeQuery("select * from BloodBankCenter");
			while(rs.next()) {
				BloodBankCenter b=new BloodBankCenter();
				b.setCenterId(rs.getInt(1));
				b.setCenterName(rs.getString(2));
				b.setState(rs.getString(3));
				b.setStreet(rs.getString(4));
				b.setCity(rs.getString(5));
				b.setPincode(rs.getString(6));
				blist.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return blist;
	}
	public BloodBankCenter getBloodBankCenterbyId(Integer id) {
		BloodBankCenter b=new BloodBankCenter();
		try {
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from BloodBankCenter where centerId=?");
			pst.setInt(1,id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				b.setCenterId(rs.getInt(1));
				b.setCenterName(rs.getString(2));
				b.setState(rs.getString(3));
				b.setStreet(rs.getString(4));
				b.setCity(rs.getString(5));
				b.setPincode(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	}

	
