package com.cg.Lab1;

import java.util.List;

public class SBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	List <Employee> empList;
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void getSbuId() {
		System.out.println("sbuCode: " + sbuId);
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public void getSbuName() {
		System.out.println("SbuName: " +sbuName);
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public void getSbuHead() {
		System.out.println("sbuHead: " +sbuHead);
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	String getSbuDetails() {
		return " sbuHead: " +sbuHead +" SbuName: " +sbuName +"]" ;
	}
}
