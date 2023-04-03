package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombres;
    private String correo;
    private Integer prioridad;
    private String contrasena;
    private String areaestudio;
    private String especialidad;
    private String tipousuario;
    private String nivelacademico;
    private String motivoregistro;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getAreaestudio() {
        return areaestudio;
    }

    public void setAreaestudio(String areaestudio) {
        this.areaestudio = areaestudio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public String getNivelacademico() {
        return nivelacademico;
    }

    public void setNivelacademico(String nivelacademico) {
        this.nivelacademico = nivelacademico;
    }

    public String getMotivoregistro() {
        return motivoregistro;
    }

    public void setMotivoregistro(String motivoregistro) {
        this.motivoregistro = motivoregistro;
    }

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }

    public Integer getPrioridad(){
        return prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getEmail() {
        return correo;
    }

    public void setEmail(String email) {
        this.correo = email;
    }

    public Usuario() {

    }
    public Usuario(Long id, String nombres, String correo, Integer prioridad, String contrasena, String areaestudio, String especialidad, String tipousuario, String nivelacademico, String motivoregistro) {
        this.id = id;
        this.nombres = nombres;
        this.correo = correo;
        this.prioridad = prioridad;
        this.contrasena = contrasena;
        this.areaestudio = areaestudio;
        this.especialidad = especialidad;
        this.tipousuario = tipousuario;
        this.nivelacademico = nivelacademico;
        this.motivoregistro = motivoregistro;
    }

    public Usuario(Usuario usuario) {
        this.id = id;
        this.nombres = usuario.getNombres();
        this.correo = usuario.getCorreo();
        this.prioridad = usuario.getPrioridad();
        this.contrasena = usuario.getContrasena();
        this.areaestudio = usuario.getAreaestudio();
        this.especialidad = usuario.getEspecialidad();
        this.tipousuario = usuario.getTipousuario();
        this.nivelacademico = usuario.getNivelacademico();
        this.motivoregistro = usuario.getMotivoregistro();
    }
}