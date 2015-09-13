package model;

import java.util.Date;
import java.util.Set;

import org.json.simple.JSONObject;

import system.Value;

public class Teacher {
	private long teacherId;
	private String name;
	private String email;
	private String contact;
	private String address;
	private Date dateOfBirth;
	private long age;
	private String qualification;
	
	private long objStatus;
	private Date createDate;
	private String remark;
	
	private Set<Course> courses;
	private Set<Salary> salaries;
	private Branch branch;
	
	public Teacher(){}
	
	public Teacher(String name, String email, String contact, String address, Date dateOfBirth, long age, String qualification, Branch branch) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.qualification = qualification;
		this.branch = branch;
		this.setObjStatus(Value.ACTIVED);
		this.setCreateDate(new Date());
	}

	/**
	 * @return the teacherId
	 */
	public long getTeacherId() {
		return teacherId;
	}
	/**
	 * @param teacherId the teacherId to set
	 */
	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the age
	 */
	public long getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(long age) {
		this.age = age;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the objStatus
	 */
	public long getObjStatus() {
		return objStatus;
	}
	/**
	 * @param objStatus the objStatus to set
	 */
	public void setObjStatus(long objStatus) {
		this.objStatus = objStatus;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the courses
	 */
	public Set<Course> getCourses() {
		return courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	/**
	 * @return the salaries
	 */
	public Set<Salary> getSalaries() {
		return salaries;
	}
	/**
	 * @param salaries the salaries to set
	 */
	public void setSalaries(Set<Salary> salaries) {
		this.salaries = salaries;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	public JSONObject toJson(){
		JSONObject returnJson = new JSONObject();
		
		return returnJson;
	}

}
