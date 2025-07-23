package org.example.phobiart.artwork.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ArtworkStatus {

	FOR_SALE("판매중"),
	SOLD_OUT("판매 완료"),
	HIDDEN("숨김"),
	DELETED("삭제");

	private final String description;
}
