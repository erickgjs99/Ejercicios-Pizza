/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopizza;

import Descuentos.precios_p;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables utilizadas en el ejercicio
        double pizza = 0;
        double prec = 0;
        double prec_total = 0;
        int option;
        int ingre = 0;
        double cuantas;
        //Preguntas hacia el consumidor :v
        System.out.print("\t Bienvenido a Chescos Pizza\n"
                + "Selecione con numeros las siguientes opciones\n");
        System.out.printf("Seleccione su pizza en el siguiente menu: \n"
                + "1._ pizza de peperoni" + "\n 2._pizza de jamon"
                + "\n 3._pizza de hawaina" + "\n 4._pizza italiana\n");
        pizza = entrada.nextDouble();
        System.out.printf("¿Cuantas pizzas deseas bb <3 ?\n");
        cuantas = entrada.nextDouble();
        System.out.printf("Desea agregar ingredientes extras a su pizza\n"
                + "1._Si\n" + "2._No\n");
        option = entrada.nextInt();
        if (option == 1) {
            System.out.printf("Selecionalos acontinuacion\n"
                    + "1._jamon\n" + "2._queso mozarella\n" + "3._pepperoni\n");
            ingre = entrada.nextInt();
            //Condicionales incondicionales nena
        }
        //Calculos de ingredientes 1
        if (option == 1) {
            if (pizza == 1 && ingre == 1) {
                prec = 18.5;
                prec_total = prec * cuantas + precios_p.ingr_1;
            }
            if (pizza == 2 && ingre == 1) {
                prec = 16.75;
                prec_total = prec * cuantas + precios_p.ingr_1;
            }
            if (pizza == 3 && ingre == 1) {
                prec = 20;
                prec_total = prec * cuantas + precios_p.ingr_1;
            }
            if (pizza == 4 && ingre == 1) {
                prec = 24.74;
                prec_total = prec * cuantas + precios_p.ingr_1;
            }
            //Calculos de ingrediente 2
            if (pizza == 1 && ingre == 2) {
                prec = 18.5;
                prec_total = prec * cuantas + precios_p.ingr_2;
            }
            if (pizza == 2 && ingre == 2) {
                prec = 16.75;
                prec_total = prec * cuantas + precios_p.ingr_2;
            }
            if (pizza == 3 && ingre == 2) {
                prec = 20;
                prec_total = prec * cuantas + precios_p.ingr_2;
            }
            if (pizza == 4 && ingre == 2) {
                prec = 24.74;
                prec_total = prec * cuantas + precios_p.ingr_2;
            }
            //Calculo de ingrediente 3
            if (pizza == 1 && ingre == 3) {
                prec = 18.5;
                prec_total = prec * cuantas + precios_p.ingr_3;
            }
            if (pizza == 2 && ingre == 3) {
                prec = 16.75;
                prec_total = prec * cuantas + precios_p.ingr_3;
            }
            if (pizza == 3 && ingre == 3) {
                prec = 20;
                prec_total = prec * cuantas + precios_p.ingr_3;
            }
            if (pizza == 4 && ingre == 3) {
                prec = 24.74;
                prec_total = prec * cuantas + precios_p.ingr_3;
            }
            //Calculo de ingrediente 4
            if (pizza == 1 && ingre == 4) {
                prec = 18.5;
                prec_total = prec * cuantas + precios_p.ingr_4;
            }
            if (pizza == 2 && ingre == 4) {
                prec = 16.75;
                prec_total = prec * cuantas + precios_p.ingr_4;
            }
            if (pizza == 3 && ingre == 4) {
                prec = 20;
                prec_total = prec * cuantas + precios_p.ingr_4;
            }
            if (pizza == 4 && ingre == 4) {
                prec = 24.74;
                prec_total = prec * cuantas + precios_p.ingr_4;
            }
            //Si el usuario no quiere ingredientes extraS
           
                if (pizza == 1 && option == 0 ) {
                    prec = 18.5;
                    prec_total = prec * cuantas;
                }
                if (pizza == 2 && option == 0) {
                    prec = 16.75;
                    prec_total = prec * cuantas;
                }
                if (pizza == 3 && option == 0) {
                    prec = 20;
                    prec_total = prec * cuantas;
                }
                if (pizza == 4 && option == 0) {
                    prec = 24.74;
                    prec_total = prec * cuantas;
                }
            }
            System.out.printf("El precio total de su pizza de: $ %.2f", prec_total);
        }

    }
