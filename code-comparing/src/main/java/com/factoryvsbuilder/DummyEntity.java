package com.factoryvsbuilder;

public class DummyEntity {
	private String prop1;
	private Long prop2;
	private String specialProp3;

	public DummyEntity(String prop1, Long prop2, String specialProp3) {
		this.prop1 = prop1;
		this.prop2 = prop2;
		this.specialProp3 = specialProp3;
	}

	public String getProp1() {
		return prop1;
	}

	public Long getProp2() {
		return prop2;
	}

	public String getSpecialProp3() {
		return specialProp3;
	}
}
