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
@Table(name="tb_User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private int UserId;
	private String RegisterName;
	private String ShenFenZhengID;
	private String NickName;
	private String PasswordMD5;
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreateTime;
	private int State;
	
	 
	
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
	public String getRegisterName() {
		return RegisterName;
	}
	public void setRegisterName(String registerName) {
		RegisterName = registerName;
	}
	public String getShenFenZhengID() {
		return ShenFenZhengID;
	}
	public void setShenFenZhengID(String shenFenZhengID) {
		ShenFenZhengID = shenFenZhengID;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	public String getPasswordMD5() {
		return PasswordMD5;
	}
	public void setPasswordMD5(String passwordMD5) {
		PasswordMD5 = passwordMD5;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	
}
