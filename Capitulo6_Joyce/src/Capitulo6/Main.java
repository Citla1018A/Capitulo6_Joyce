/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6;

import Capitulo6.CasePEventDemo.EventDemo;
import Capitulo6.CasePRental.Rental;
import Capitulo6.GameZoneDie.Die;
import Capitulo6.GameZoneDie.Usuario;
import Capitulo6.GameZoneJugador.Jugador;
import Capitulo6.GameZonePregunta.Quizz;
import Capitulo6.GameZonePregunta.Respuesta;
import Capitulo6.GameZoneRandomGuess3.RandomGuess3;
import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CASE PROBLEM");
        System.out.println("1");
        EventDemo fiesta = new EventDemo("Fiesta de jairo",2);
        fiesta.solicitarElemento();
        fiesta.invitacion();
        System.out.println("2");
        Rental moto = new Rental("Rentar Moto",120);
        moto.setMinutos();
        moto.cupones();
        System.out.println("GAME ZONE");
        System.out.println("1");
        Quizz pregunta1 = new Quizz();
        pregunta1.añadirPregunta("¿Cuanto es 2 + 2?");
        pregunta1.añadirRespuesta(0,new Respuesta("Cuatro",true));
        pregunta1.añadirRespuesta(1,new Respuesta("20",false));
        pregunta1.checar(0,0);
        System.out.println("2");
        RandomGuess3 juego = new RandomGuess3();
        juego.jugar();
        System.out.println("3");
         Scanner sc = new Scanner(System.in);
        Die dado1 = new Die();
        Die dado2 = new Die();
        int x= dado1.sumaValor(dado2);
        int i = 0;
         Usuario usu = new Usuario();
             for (int j = 0; j < 3; j++) {
            System.out.println(x);
            usu.setPrediccion();
            if (x == usu.getPrediccion()){
                System.out.printf("GANASTE");
                return;
            }else{
                dado1.lanzar();
                dado2.lanzar();
                x= dado1.sumaValor(dado2);
            }
        }
        System.out.println("GANA LA PC");
        System.out.println("5");
         Jugador jugador1 = new Jugador();
        Jugador pc = new Jugador();
        int local = 0;
        do {
            jugador1.jugar();
            pc.jugarPC(jugador1.getValor());
            System.out.println("La computadora lanzo el " + pc.getOpc());
            local += jugador1.getOpc()+pc.getOpc();
            System.out.println(local);
        }while (local <=21);

        if (local > 21){
            System.out.println("Perdiste");
        }else{
            System.out.println("Gano la PC");
        }
        
    }
        
    
    
}
