package com.factoryvsbuilder;

public class DummyDTO {
	private String prop1;
	private Long partOfNumberProp2;
	private Long anotherPartOfNumberProp2;
	private DummySpecialPropDTO specialProp;

	public DummyDTO() {
	}

	public String getProp1() {
		return prop1;
	}

	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}

	public Long getPartOfNumberProp2() {
		return partOfNumberProp2;
	}

	public void setPartOfNumberProp2(Long partOfNumberProp2) {
		this.partOfNumberProp2 = partOfNumberProp2;
	}

	public Long getAnotherPartOfNumberProp2() {
		return anotherPartOfNumberProp2;
	}

	public void setAnotherPartOfNumberProp2(Long anotherPartOfNumberProp2) {
		this.anotherPartOfNumberProp2 = anotherPartOfNumberProp2;
	}

	public DummySpecialPropDTO getSpecialProp() {
		return specialProp;
	}

	public void setSpecialProp(DummySpecialPropDTO specialProp) {
		this.specialProp = specialProp;
	}
}
