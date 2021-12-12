package com.ejm.discovery.api.enums;

public enum BusinessUnits {

	CHM("Chemicals"), NMT("Noble Metals"), PMM("Precious Metals Management");

	public final String label;

	private BusinessUnits(String label) {
		this.label = label;
	}
}
