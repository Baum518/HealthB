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
@Table(name="tb_Record_BloodPressure")
public class Record_BloodPressure {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private int UserId;
	private int SBP;
	private int DBP;
	private int MBP;
	private int HeartRate;
	private int Arrhythmia;
	private int DeviceId;
	private int MNC;
	private int LAC;
	private int CellID;
	@Temporal(TemporalType.TIMESTAMP)
	private Date MeasureTime;
	private int IsDelete;
	private int DeleteUserId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date DeleteTime;
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
	public int getSBP() {
		return SBP;
	}
	public void setSBP(int sBP) {
		SBP = sBP;
	}
	public int getDBP() {
		return DBP;
	}
	public void setDBP(int dBP) {
		DBP = dBP;
	}
	public int getMBP() {
		return MBP;
	}
	public void setMBP(int mBP) {
		MBP = mBP;
	}
	public int getHeartRate() {
		return HeartRate;
	}
	public void setHeartRate(int heartRate) {
		HeartRate = heartRate;
	}
	public int getArrhythmia() {
		return Arrhythmia;
	}
	public void setArrhythmia(int arrhythmia) {
		Arrhythmia = arrhythmia;
	}
	public int getDeviceId() {
		return DeviceId;
	}
	public void setDeviceId(int deviceId) {
		DeviceId = deviceId;
	}
	public int getMNC() {
		return MNC;
	}
	public void setMNC(int mNC) {
		MNC = mNC;
	}
	public int getLAC() {
		return LAC;
	}
	public void setLAC(int lAC) {
		LAC = lAC;
	}
	public int getCellID() {
		return CellID;
	}
	public void setCellID(int cellID) {
		CellID = cellID;
	}
	public Date getMeasureTime() {
		return MeasureTime;
	}
	public void setMeasureTime(Date measureTime) {
		MeasureTime = measureTime;
	}
	public int getIsDelete() {
		return IsDelete;
	}
	public void setIsDelete(int isDelete) {
		IsDelete = isDelete;
	}
	public int getDeleteUserId() {
		return DeleteUserId;
	}
	public void setDeleteUserId(int deleteUserId) {
		DeleteUserId = deleteUserId;
	}
	public Date getDeleteTime() {
		return DeleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		DeleteTime = deleteTime;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	

}
