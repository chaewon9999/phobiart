package org.example.phobiart.user.repository;

import org.example.phobiart.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
