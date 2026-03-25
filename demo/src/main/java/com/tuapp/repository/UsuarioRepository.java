package com.tuapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tuapp.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}