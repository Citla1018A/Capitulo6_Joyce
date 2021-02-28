/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.GameZonePregunta;

/**
 *
 * @author Citlalli
 */
public class Respuesta {
    private String respuesta;
    private Boolean calificacion;

    public Respuesta(String respuesta, Boolean calificacion) {
        this.respuesta = respuesta;
        this.calificacion = calificacion;
    }

    public String getRespuesta(){
        return respuesta;
    }

    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }

    public Boolean getCalificacion(){
        return this.calificacion;
    }
}
