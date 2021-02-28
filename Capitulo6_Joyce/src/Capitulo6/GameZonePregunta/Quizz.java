/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.GameZonePregunta;

import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class Quizz {
    private ArrayList<Pregunta> quiz;

    public Quizz(){
        this.quiz = new ArrayList<>();
    }

    public void añadirPregunta(String pregunta){
        quiz.add(new Pregunta(pregunta));
    }

    public void añadirRespuesta(int numero, Respuesta res){
        Pregunta aux = quiz.get(numero);
        aux.setRespuestas(res.getRespuesta(),res.getCalificacion());
        quiz.set(numero,aux);
    }

    public void checar(int i, int j){
        if (quiz.get(i).checarRespuesta(j)){
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta");
        }
    }

    public void imprimir(int i){
        System.out.println(quiz.get(i).toString());
    }

}
