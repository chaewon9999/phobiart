package org.example.phobiart.userlikes.entity;

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
@Table(name = "tb_userlikes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserLikes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "liker_id")
	private User liker;

	@ManyToOne
	@JoinColumn(name = "liked_id")
	private User likedUser;

	@Builder
	public UserLikes(User liker, User likedUser) {
		this.liker = liker;
		this.likedUser = likedUser;
	}
}
