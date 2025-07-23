package org.example.phobiart.artworklikes.entity;

import org.example.phobiart.artwork.entity.Artwork;
import org.example.phobiart.common.entity.BaseEntity;
import org.example.phobiart.user.entity.User;

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
@Table(name = "tb_artwork_likes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArtworkLikes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "artwork_id")
	private Artwork artwork;

	@Builder
	public ArtworkLikes(User user, Artwork artwork) {
		this.user = user;
		this.artwork = artwork;
	}
}
