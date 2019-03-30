package com.yiibai.common;

public class Developer {
	private Language language;

	public Developer(Language language) {
		System.out.println("By constructor!");
		this.language = language;
	}

	@Override
	public String toString() {
		return "Developer [language=" + language + "]";
	}

}