/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructores;

/**
 *
 * @author Granda
 */
public class Principal {

    public static void main(String[] args) {

        Entrenador entrenador1 = new Entrenador("Rene", 35, "Fútbol");
        Entrenador entrenador2 = new Entrenador();
        
        System.out.printf("entrenador1: Nombre %s - Edad %d \n",
                entrenador1.getNombre(), entrenador1.getEdad());
        System.out.printf("entrenador2: Nombre %s - Edad %d \n",
                entrenador2.getNombre(), entrenador2.getEdad());
        //Proceso de cambio de valores
        entrenador1.setNombre("Rolando");
        System.out.printf("entrenador1: Nombre %s - Edad %d \n",
                entrenador1.getNombre(), entrenador1.getEdad());
    }

}
