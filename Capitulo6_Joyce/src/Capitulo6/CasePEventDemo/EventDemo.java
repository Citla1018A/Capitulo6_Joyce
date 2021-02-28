/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.CasePEventDemo;

import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class EventDemo {
    Scanner sc = new Scanner(System.in);
    private final static Integer precioInvitado = 35;
    private final static Integer granEvento = 50;
    private String evento;
    private Integer numeroDeInvitados;
    private  Integer costo;

    public EventDemo(String evento, Integer numeroDeInvitados){
        this.evento = evento;
        this.numeroDeInvitados = numeroDeInvitados;
        this.costo = numeroDeInvitados * precioInvitado;
    }

    public void solicitarElemento(){
        do {
            System.out.println("Ingrese el numero de invitados");
            System.out.println("Recuerda que debe de estar entre 50 y 100");
            this.numeroDeInvitados = sc.nextInt();
        }while(this.numeroDeInvitados > 101 || this.numeroDeInvitados < 5 );
    }

    public void invitacion(){
        for (int i = 0; i < this.numeroDeInvitados; i++) {
            System.out.println("¡Por favor, ven a mi evento!");
        }
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Integer getNumeroDeInvitados() {
        return numeroDeInvitados;
    }

    public void setNumeroDeInvitados(Integer numeroDeInvitados) {
        this.numeroDeInvitados = numeroDeInvitados;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

}
