
package com.mycompany.charottigabrielnum;

import java.util.Scanner;


public class CharottiGabrielFRASE {

    
    public static void main(String[] args) {
        String a, b = "";//declaramos dos variables
        Scanner entrada = new Scanner(System.in);
        System.out.print("Inserta la palabra que quieres analizar");
        a = entrada.nextLine();
        int n = a.length();//guardamos el tamaño del string
        for(int i = n - 1; i >= 0; i--)//for recursivo que se encarga de contar letra por letra desde la ultima
        {
            b = b + a.charAt(i);//usamos char at para que vya aletra por letra comprobando si la plabra es palindroma.
        }
        if(a.equalsIgnoreCase(b))//ignora que las letras sean mayusculas y minusculas
        {
            System.out.println("La palabra es palindroma.");
        }
        else
        {
            System.out.println("La palabra no es palindroma");
        }
    }
    
}
