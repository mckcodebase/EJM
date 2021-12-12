package com.ejm.discovery.api.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class AccountBalance {

	@JsonProperty("ref")
	private Integer reference;
	@JsonProperty("bu_cd")
	private String businessUnitCode;
	@JsonProperty("loc_cd")
	private String locationCode;
	@JsonProperty("acc_typ")
	private String accountType;
	@JsonProperty("data_env")
	private String dataEnv;
	@JsonProperty
	MetalBalance metalbalance;

	public MetalBalance getMetalbalance() {
		return metalbalance;
	}

	public void setMetalbalance(MetalBalance metalbalance) {
		this.metalbalance = metalbalance;
	}

	public AccountBalance(Integer reference, String businessUnitCode, String locationCode, String accountType,
			String dataEnv, MetalBalance metalbalance) {
		super();
		this.reference = reference;
		this.businessUnitCode = businessUnitCode;
		this.locationCode = locationCode;
		this.accountType = accountType;
		this.dataEnv = dataEnv;
		this.metalbalance = metalbalance;

	}

	public Integer getReference() {
		return reference;
	}

	public void setReference(Integer reference) {
		this.reference = reference;
	}

	public String getBusinessUnitCode() {
		return businessUnitCode;
	}

	public void setBusinessUnitCode(String businessUnitCode) {
		this.businessUnitCode = businessUnitCode;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getDataEnv() {
		return dataEnv;
	}

	public void setDataEnv(String dataEnv) {
		this.dataEnv = dataEnv;
	}

}
