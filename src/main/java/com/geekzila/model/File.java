package com.geekzila.model;

public class File {
	private String name;
	private Integer page;
	
	public File(String name, Integer page) {
		this.name = name;
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
	
	

}
