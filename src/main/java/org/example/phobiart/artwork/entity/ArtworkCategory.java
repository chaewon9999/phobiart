package org.example.phobiart.artwork.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ArtworkCategory {

	PAINTING("그림"),
	SCULPTURE("조각품"),
	CERAMICS("도자기"),
	DIGITAL_ART("디지털 아트"),
	CALLIGRAPHY("캘리그라피"),
	PRINTMAKING("판화"),
	MUSIC("음악"),
	VIDEO("영상"),
	TEXTILE_ART("섬유 예술"),
	CRAFT("공예"),
	OTHER("기타");

	private final String description;
}
