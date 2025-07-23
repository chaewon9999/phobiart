package org.example.phobiart.review.entity;

import org.example.phobiart.artwork.entity.Artwork;
import org.example.phobiart.common.entity.BaseEntity;

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
@Table(name = "tb_review")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Review extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String review;

	@ManyToOne
	@JoinColumn(name = "artwork_id")
	private Artwork artwork;

	@Builder
	public Review(String review) {
		this.review = review;
	}
}
