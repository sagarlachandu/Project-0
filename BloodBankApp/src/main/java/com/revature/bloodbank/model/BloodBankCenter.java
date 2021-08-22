package com.revature.bloodbank.model;
import com.revature.bloodbank.controller.BloodBankController;
public class BloodBankCenter {
	private Integer centerId;
	private String centerName;
	private String street;
	private String city;
	private String state;
	private String pincode;
	public Integer getCenterId() { return centerId; }
	public String getCenterName() { return centerName; }
	public String getStreet() { return street; }
	public String getCity() { return city; }
	public String getState() { return state; }
	public String getPincode() { return pincode; }
	public String toString() {
		return "BloodBankCenter [centerId=" + centerId + ", centerName=" + centerName + ", street=" + street + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + "]"; }
	public void setCenterId(Integer centerId) { this.centerId = centerId; }
	public void setCenterName(String centerName) { this.centerName = centerName; }
	public void setStreet(String street) { this.street = street; }
	public void setCity(String city) { this.city = city; }
	public void setState(String state) { this.state = state; }
	public void setPincode(String pincode) { this.pincode = pincode; }
}
