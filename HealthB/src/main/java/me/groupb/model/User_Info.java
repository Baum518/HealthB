package me.groupb.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_User_Info")
public class User_Info {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private int UserId;
	private String OpenId;
	private	String RealName;
	private String RealNamePY;
	private int Sex;
	@Temporal(TemporalType.DATE)
	private Date Birthdate;
	private int MobilePhone;
	private String PhoneNumber1;
	private String PhoneNumber2;
	private String City;
	private String Country;
	private String Province;
	private String Address;
	private String HeadImgUrl;
	private String Language;
	private String MedicalHistory;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getOpenId() {
		return OpenId;
	}
	public void setOpenId(String openId) {
		OpenId = openId;
	}
	public String getRealName() {
		return RealName;
	}
	public void setRealName(String realName) {
		RealName = realName;
	}
	public String getRealNamePY() {
		return RealNamePY;
	}
	public void setRealNamePY(String realNamePY) {
		RealNamePY = realNamePY;
	}
	public int getSex() {
		return Sex;
	}
	public void setSex(int sex) {
		Sex = sex;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public int getMobilePhone() {
		return MobilePhone;
	}
	public void setMobilePhone(int mobilePhone) {
		MobilePhone = mobilePhone;
	}
	public String getPhoneNumber1() {
		return PhoneNumber1;
	}
	public void setPhoneNumber1(String phoneNumber1) {
		PhoneNumber1 = phoneNumber1;
	}
	public String getPhoneNumber2() {
		return PhoneNumber2;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		PhoneNumber2 = phoneNumber2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getHeadImgUrl() {
		return HeadImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		HeadImgUrl = headImgUrl;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getMedicalHistory() {
		return MedicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		MedicalHistory = medicalHistory;
	}
	public Date getSubscibeTime() {
		return SubscibeTime;
	}
	public void setSubscibeTime(Date subscibeTime) {
		SubscibeTime = subscibeTime;
	}
	public Date getUnSubcibeTime() {
		return UnSubcibeTime;
	}
	public void setUnSubcibeTime(Date unSubcibeTime) {
		UnSubcibeTime = unSubcibeTime;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	private Date SubscibeTime;
	private Date UnSubcibeTime;
	private Date CreateTime;
}
