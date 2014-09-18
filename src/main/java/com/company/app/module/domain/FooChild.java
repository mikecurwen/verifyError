package com.company.app.module.domain;

public class FooChild {
	Long id;
	String codeName;
	String shortName;

	public FooChild(Long id) {
		this.setId(id);
	}
	public FooChild(Long id, String codeName, String shortName) {
		this(id);
		this.setCodeName(codeName);
		this.setShortName(shortName);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
}
