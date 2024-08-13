package com.msvc.usuario.service;

import java.util.List;

import com.msvc.usuario.entity.Usuario;

public interface UsuarioService {
	
    Usuario saveUsuario(Usuario usuario);

    List<Usuario> getAllUsuarios();

    Usuario getUsuario(String usuarioId);
}
