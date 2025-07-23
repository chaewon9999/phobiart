package org.example.phobiart.artwork.entity;

import org.example.phobiart.common.entity.BaseEntity;
import org.example.phobiart.user.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_artwork")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Artwork extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(nullable = false)
	private ArtworkCategory category;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private Integer price;

	@Column(nullable = false)
	private String medium;

	@Column(nullable = false)
	private Integer size;

	@Column(nullable = false)
	private ArtworkStatus artworkStatus;

	@Builder
	public Artwork(User user, ArtworkCategory category, String title, String description, Integer price, String medium, Integer size) {
		this.user = user;
		this.category = category;
		this.title = title;
		this.description = description;
		this.price = price;
		this.medium = medium;
		this.size = size;
		this.artworkStatus = ArtworkStatus.FOR_SALE;
	}
}
