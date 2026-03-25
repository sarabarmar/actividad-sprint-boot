package com.tuapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuapp.model.Usuario;
import com.tuapp.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario actualizar(Long id, Usuario datos) {
        Usuario usuario = repository.findById(id).orElse(null);

        if (usuario != null) {
            usuario.setNombre(datos.getNombre());
            usuario.setEmail(datos.getEmail());
            usuario.setPassword(datos.getPassword());
            return repository.save(usuario);
        }
        return null;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}