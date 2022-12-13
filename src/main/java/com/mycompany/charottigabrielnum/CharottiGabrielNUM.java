/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.charottigabrielnum;

import java.util.Scanner;

/**
 *
 * @author gabylepek
 */
public class CharottiGabrielNUM {

    public static void main(String[] args) {
      String num;
        int contador1 = 0;//declaramos dos variables contador para contar el numero de caracteres que va a tener el string que introduciremos.
        int contador2;
        boolean pal = true;//hacemos un booleano para declarar que es palindromo en caso de que sea correcto el string.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        num = entrada.nextLine();
        contador2 = num.length()-1;//Ponemos el contador 2 en menos uno para que empiece a contar desde el caracter numero 0.
        
        while(pal && contador1 != num.length()/2){//hacemos que cada uno de los contadores se quede con la mitad de el string ya que los palindromos se basan en dos partes iguales
            if(num.charAt(contador1) != num.charAt(contador2)){
                pal = false;//en caso de que el numero no sea palindromo te echa del prgrama y te dice que no es palindromo
            } else {
                contador1++;//hacemos que el contador uno cunate de 0 a la mitad del string y el contador 2 de el ultimo caracter hast la mitad.
                contador2--;
            }
        }
        if(pal){//en caso de que el boolean pal siga como true el palindromo seta correcto 
            System.out.println("el numero es palindromo");//si los contadores al compararse son iguales el numero sera palindromo,en caso de que no el numeor no lo sera.
        } else {
            System.out.println("el numero no es palindromo");
        }  
    }
}
