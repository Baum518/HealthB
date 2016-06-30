package me.groupb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_Device_Type")
public class Device_Type {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String DeviceName;
	private int DeviceType;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public int getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(int deviceType) {
		DeviceType = deviceType;
	}
}
