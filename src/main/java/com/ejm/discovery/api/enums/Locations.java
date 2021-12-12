package com.ejm.discovery.api.enums;

public enum Locations {

	ROY("Royston"), WDP("West Deptford"), WWD("West Whiteland"), VFC("Valley Forge"), HGK("Hong Kong");

	public final String label;

	private Locations(String label) {
		this.label = label;
	}
}
