package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    public abstract ArrayList<Usuario> findByPrioridad(Integer id);

    public abstract Usuario findByCorreo(String correo);

    public abstract ArrayList<Usuario> findByCorreoAndContrasena(String correo, String contrasena);
}