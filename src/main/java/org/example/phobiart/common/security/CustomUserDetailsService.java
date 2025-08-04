package org.example.phobiart.common.security;

import org.example.phobiart.common.exception.CustomException;
import org.example.phobiart.common.exception.ErrorCode;
import org.example.phobiart.user.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findById(Long.valueOf(username))
			.map(CustomUserPrincipal::new)
			.orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
	}

}
