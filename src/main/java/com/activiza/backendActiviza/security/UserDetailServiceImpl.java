package com.activiza.backendActiviza.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.activiza.backendActiviza.model.Usuario;
import com.activiza.backendActiviza.repository.UsuarioRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository
				.findOneByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("El usuario con email "+email+" no existe."));
		
		return new UserDetailsImpl(usuario);
	}
	
}
