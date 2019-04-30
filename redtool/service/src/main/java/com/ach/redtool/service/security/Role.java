package com.ach.redtool.service.security;

public enum Role {

	USER("User"), ADMIN("Admin"), SUPERUSER("SuperUser");

	private final String role;

	private Role(String role) {
		this.role = role;
	}

	public String getValue() {
		return role;
	}

	@Override
	public String toString() {
		return this.getValue();
	}

}
