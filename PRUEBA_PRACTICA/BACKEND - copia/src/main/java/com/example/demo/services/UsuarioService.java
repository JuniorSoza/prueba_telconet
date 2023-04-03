package com.example.demo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.Usuario;
import com.example.demo.objects.Response;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    private EntityManager em;

    public UsuarioService(EntityManager em) {
        this.em = em;
    }
    
    public Response obtenerUsuarios(){
        return new Response(200,"","", (ArrayList<Usuario>) usuarioRepository.findAll());
    }

    public Response guardarUsuario(Usuario usuario){
        try{
            //validacion de correo
            Usuario usuario1 = new Usuario();
            usuario1 = this.usuarioRepository.findByCorreo(usuario.getCorreo());
            System.out.print(usuario1);
            if (usuario1 != null){
                return new Response(400,"ok","El correo ya fue usado: "+usuario.getCorreo(),null);
            }
            //validacion de clave

            usuarioRepository.save(usuario);
            return new Response(200,"ok","Usuario ingresado", null);
        }catch (Exception e){
            return new Response(500,"ok",e.getMessage(),null);
        }
    }

    public Response obtenerPorId(Long id){
        return new Response(200,"","", Collections.singletonList(usuarioRepository.findById(id)));
    }

    public Response editarUsuario(Usuario usuario) {
        try{
            Optional<Usuario> usuario1 = Optional.of(new Usuario());
            usuario1 = this.usuarioRepository.findById(usuario.getId());
            usuario.setCorreo(usuario1.get().getCorreo());
            usuario.setTipousuario(usuario1.get().getTipousuario());
            usuarioRepository.save(usuario);
            return new Response(200,"","", Collections.singletonList(usuarioRepository.findById(usuario.getId())));
        }catch(Exception err){
            return new Response(500,"",err.getMessage(), Collections.singletonList(usuarioRepository.findById(usuario.getId())));
        }
    }

    public ArrayList<Usuario>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public ArrayList<Usuario> logeo(String email, String password){
        return usuarioRepository.findByCorreoAndContrasena(email,password);
    }
    
}