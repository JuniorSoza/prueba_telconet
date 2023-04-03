package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import com.example.demo.objects.Response;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value="/security")
@CrossOrigin(origins = "http://localhost:4200")
public class SecurityController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping( path = "logeo/{user}/{password}")
    public Response logeo(@PathVariable("user") String user, @PathVariable("password") String password) {
        ArrayList<Usuario> respuesta = new ArrayList<>();
        respuesta = this.usuarioService.logeo(user,password);
        if(respuesta.size()>0){
            return new Response(200,"ok","",respuesta);
        }else{
            return new Response(401,"ok","Sin resultados",respuesta);
        }
    }
}
