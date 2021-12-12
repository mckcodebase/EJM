package com.ejm.discovery.api.view;

public class MetalBalances {

	private String metal_id;
	private String metal_name;
	private String metal_Yes;
	private String metal_No;
	private Double metal_balance;
	

	public MetalBalances(String metal_id,String metal_name,String metal_Yes, String metal_No,Double metal_balance) {
		super();
		this.metal_id = metal_id;
		this.metal_name = metal_name;
		this.metal_Yes = metal_Yes;
		this.metal_No = metal_No;
		this.metal_balance = metal_balance;
		
	}

	public String getMetal_id() {
		return metal_id;
	}

	public void setMetal_id(String metal_id) {
		this.metal_id = metal_id;
	}

	public String getMetal_name() {
		return metal_name;
	}

	public void setMetal_name(String metal_name) {
		this.metal_name = metal_name;
	}

	public String getMetal_Yes() {
		return metal_Yes;
	}

	public void setMetal_Yes(String metal_Yes) {
		this.metal_Yes = metal_Yes;
	}

	public String getMetal_No() {
		return metal_No;
	}

	public void setMetal_No(String metal_No) {
		this.metal_No = metal_No;
	}

	public Double getMetal_balance() {
		return metal_balance;
	}

	public void setMetal_balance(Double metal_balance) {
		this.metal_balance = metal_balance;
	}

}
