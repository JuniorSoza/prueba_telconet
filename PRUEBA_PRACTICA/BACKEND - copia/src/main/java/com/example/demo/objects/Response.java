package com.example.demo.objects;

import java.util.List;

public class Response {

    private Integer key;
    private String status;
    private String mensaje;
    private List respuesta;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(List respuesta) {
        this.respuesta = respuesta;
    }

    public Response(Integer key, String status, String mensaje, List respuesta) {
        this.key = key;
        this.status = status;
        this.mensaje = mensaje;
        this.respuesta = respuesta;
    }
}
