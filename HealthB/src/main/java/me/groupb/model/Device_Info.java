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
@Table(name="tb_Device_Info")
public class Device_Info {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private int DeviceId;
	private String DeviceIdWithChar;
	private int Password;
	private int DeviceType;
	private int BatchNo;
	private String Producer;
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreateTime;
	private int SimNumber;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(int deviceId) {
		DeviceId = deviceId;
	}
	public String getDeviceIdWithChar() {
		return DeviceIdWithChar;
	}
	public void setDeviceIdWithChar(String deviceIdWithChar) {
		DeviceIdWithChar = deviceIdWithChar;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}
	public int getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(int deviceType) {
		DeviceType = deviceType;
	}
	public int getBatchNo() {
		return BatchNo;
	}
	public void setBatchNo(int batchNo) {
		BatchNo = batchNo;
	}
	public String getProducer() {
		return Producer;
	}
	public void setProducer(String producer) {
		Producer = producer;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	public int getSimNumber() {
		return SimNumber;
	}
	public void setSimNumber(int simNumber) {
		SimNumber = simNumber;
	}
	

}
