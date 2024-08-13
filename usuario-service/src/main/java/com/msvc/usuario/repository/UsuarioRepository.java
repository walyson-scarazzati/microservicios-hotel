package com.msvc.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msvc.usuario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
