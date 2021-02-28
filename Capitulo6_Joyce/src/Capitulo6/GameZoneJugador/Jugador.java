/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.GameZoneJugador;

import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class Jugador {
    private Scanner sc;
    private Integer opc;
    private Integer valor;

    public Jugador(){
        sc = new Scanner(System.in);
        valor = 0;
    }

    public void jugar(){
        System.out.println("Ingresa un valor entre 1 y 3");
        opc = sc.nextInt();
        if (validar(opc) == true){
            valor += valor;
        }else{
            System.out.println("Ingresa un valor valido");
        }
    }

    public void jugarPC(int x){
        if (x <= 17){
            this.opc = (int) (Math.random()*3+1);
        }else{
            if (x == 18){
                this.opc = 3;
            }
            if (x == 19) {
                this.opc = 2;
            }if (x == 20){
                this.opc = 1;
            }
        }

    }

    private boolean validar(int n){
        return n >3 || n < 1 ? false : true;
    }

    public Integer getValor(){
        return this.valor;
    }

    public Integer getOpc(){
        return this.opc;
    }
}
