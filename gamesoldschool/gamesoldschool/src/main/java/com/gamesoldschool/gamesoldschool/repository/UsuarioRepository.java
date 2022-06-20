package com.gamesoldschool.gamesoldschool.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesoldschool.gamesoldschool.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	public Optional<Usuario>findByUsuario(String usuario);
}
