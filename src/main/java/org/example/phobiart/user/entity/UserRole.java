package org.example.phobiart.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRole {

	USER("회원"),
	ADMIN("관리자");

	private final String description;
}
