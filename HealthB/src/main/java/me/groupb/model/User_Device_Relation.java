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
@Table(name="tb_User_Device_Relation")
public class User_Device_Relation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private int UserId;
	private int DeviceId;
	private int DeviceUser;
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreateTime;
	private int IsUnbind;
	private int UnbindUserId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date UnbindTime;
	private String Note;
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
	public int getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(int deviceId) {
		DeviceId = deviceId;
	}
	public int getDeviceUser() {
		return DeviceUser;
	}
	public void setDeviceUser(int deviceUser) {
		DeviceUser = deviceUser;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	public int getIsUnbind() {
		return IsUnbind;
	}
	public void setIsUnbind(int isUnbind) {
		IsUnbind = isUnbind;
	}
	public int getUnbindUserId() {
		return UnbindUserId;
	}
	public void setUnbindUserId(int unbindUserId) {
		UnbindUserId = unbindUserId;
	}
	public Date getUnbindTime() {
		return UnbindTime;
	}
	public void setUnbindTime(Date unbindTime) {
		UnbindTime = unbindTime;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	
	
}
