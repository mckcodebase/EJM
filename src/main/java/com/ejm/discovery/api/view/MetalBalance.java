package com.ejm.discovery.api.view;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetalBalance {

	private Integer ref_id;
	private String acc_name;
	private String acc_type;
	private String jm_bu_name;
	private String jm_loc;

	@JsonProperty
	private List<MetalBalances> metalbalances;

	
	
	public List<MetalBalances> getMetalbalances() {
		return metalbalances;
	}

	public void setMetalbalances(List<MetalBalances> metalbalances) {
		this.metalbalances = metalbalances;
	}

	public MetalBalance(Integer ref_id, String acc_name, String acc_type, String jm_bu_name, String jm_loc,List<MetalBalances> metalbalances) {
		super();
		this.ref_id = ref_id;
		this.acc_name = acc_name;
		this.acc_type = acc_type;
		this.jm_bu_name = jm_bu_name;
		this.jm_loc = jm_loc;
		this.metalbalances = metalbalances;

	}

	public Integer getRef_id() {
		return ref_id;
	}

	public void setRef_id(Integer ref_id) {
		this.ref_id = ref_id;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public String getJm_bu_name() {
		return jm_bu_name;
	}

	public void setJm_bu_name(String jm_bu_name) {
		this.jm_bu_name = jm_bu_name;
	}

	public String getJm_loc() {
		return jm_loc;
	}

	public void setJm_loc(String jm_loc) {
		this.jm_loc = jm_loc;
	}

}
