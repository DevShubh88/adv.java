package com.demo.model;

public class packs {
	
	private String custno;
	private String basepack;
	private String optionalpack;
	
	public packs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public packs(String custno, String basepack, String optionalpack) {
		super();
		this.custno = custno;
		this.basepack = basepack;
		this.optionalpack = optionalpack;
	}
	public String getCustno() {
		return custno;
	}
	public void setCustno(String custno) {
		this.custno = custno;
	}
	public String getBasepack() {
		return basepack;
	}
	public void setBasepack(String basepack) {
		this.basepack = basepack;
	}
	public String getOptionalpack() {
		return optionalpack;
	}
	public void setOptionalpack(String optionalpack) {
		this.optionalpack = optionalpack;
	}
	@Override
	public String toString() {
		return "packs [custno=" + custno + ", basepack=" + basepack + ", optionalpack=" + optionalpack + "]";
	}
	
	
	

}
