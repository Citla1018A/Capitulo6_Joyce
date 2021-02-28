/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.CasePRental;

import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class Rental {
    Scanner sc= new Scanner(System.in);
    private String contrato;
    private Integer minutos;
    private Integer horas;
    private Integer minutosExtras;
    private Integer costos;
    private  Integer Cupones;

    public Rental(String contrato, Integer minutos){
        this.contrato = contrato;
        this.minutos = minutos;
        this.horas = minutos / 60;
        this.minutosExtras = this.minutos % 60;
        this.costos = (this.horas * 40) + this.minutosExtras;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos() {
        int minutos = 0;
        do {
            System.out.println("Por favor introduce tus minutos recuerda que debe de estar en un rango de 60 y 7200");
            minutos = sc.nextInt();
        }while (minutos >7201 || minutos < 60);
        this.minutos = minutos;
        this.horas = minutos / 60;
        this.minutosExtras = this.minutos % 60;
        this.costos = (this.horas * 40) + this.minutosExtras;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMinutosExtras() {
        return minutosExtras;
    }

    public Integer getCostos() {
        return costos;
    }

    public void setCostos(Integer costos) {
        this.costos = costos;
    }

    public void cupones(){
        for (int i = 0; i < getHoras() ; i++) {
            System.out.println("Cupon valido de 10%");
        }
    }
}
