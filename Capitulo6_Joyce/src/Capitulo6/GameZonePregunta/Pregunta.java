/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.GameZonePregunta;

import java.util.Arrays;

/**
 *
 * @author Citlalli
 */
public class Pregunta {
    private String pregunta;
    private Respuesta[] respuestas;
    private Integer contador;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.respuestas = new Respuesta[5];
        this.contador = 0;
    }

    public void setRespuestas(String respuesta, boolean calificacion){
         if (contador<4){
            this.respuestas[contador] = new Respuesta(respuesta,calificacion);
         }
        contador++;
    }

    public Boolean checarRespuesta(int i){
        return respuestas[i].getCalificacion();
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "pregunta='" + pregunta + '\'' +
                ", respuestas=" + Arrays.toString(respuestas) +
                ", contador=" + contador +
                '}';
    }
}
