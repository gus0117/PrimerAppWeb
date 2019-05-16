/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerappweb.aplicaion.controlador.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;

@ManagedBean
public class MensajeBean implements Serializable{

    private String mensaje;
    
    private String mensajeEntrada;
    private String mensajeSalida;
    
    public MensajeBean() {
        mensaje = "Programacion Visual 2019 - Grupo 7";
    }
    public void cambiarMensaje(){
        mensajeSalida = mensajeEntrada;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensajeEntrada() {
        return mensajeEntrada;
    }

    public void setMensajeEntrada(String mensajeEntrada) {
        this.mensajeEntrada = mensajeEntrada;
    }

    public String getMensajeSalida() {
        return mensajeSalida;
    }

    public void setMensajeSalida(String mensajeSalida) {
        this.mensajeSalida = mensajeSalida;
    }
    
}
