package model;

import java.util.Date;

public class StagHealthPath {
	private int id;
	private String patientId;
	private String PatientName;
	private String hospitalID;
	private String hospitalName;
	//TODO:Date Type
	private String startDate;  
	private String endDate;
	private Date lastUpdate;
	private String duration;
	private String source;
	
	//default constructor
	public StagHealthPath() {}
	
	//attributes constructor
	public StagHealthPath(int id, String patientId, String patientName,
			String hospitalID, String hospitalName, String startDate,
			String endDate, Date lastUpdate, String duration, String source) {
		super();
		this.id = id;
		this.patientId = patientId;
		PatientName = patientName;
		this.hospitalID = hospitalID;
		this.hospitalName = hospitalName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.lastUpdate = lastUpdate;
		this.duration = duration;
		this.source = source;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" id :");
		builder.append(id);
		builder.append(" , patientId: ");
		builder.append(patientId);
		builder.append(" , PatientName: ");
		builder.append(PatientName);
		builder.append(" , hospitalID: ");
		builder.append(hospitalID);
		builder.append(" , hospitalName: ");
		builder.append(hospitalName);
		builder.append(" , startDate: ");
		builder.append(startDate);
		builder.append(" , endDate: ");
		builder.append(endDate);
		builder.append(" , lastUpdate: ");
		builder.append(lastUpdate);
		builder.append(" , duration: ");
		builder.append(duration);
		builder.append(" , source: ");
		builder.append(source);
		return builder.toString();
	}
	
}
