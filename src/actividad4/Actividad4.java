/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class Actividad4 {

    /**
     * Factorial de un numero ingresado
     * Factoriales
     */
    public static void factorial(){
        int numero = 10;
        int factorial = 1;
        while (numero != 0) {
            factorial *= numero;
            numero--;
        }
        System.out.println("El Factorial de 10 es " + factorial);
    }
    /**
     * Operacion suma de y promedio de un numero
     * Suma y factorial
     */
    public static void suma(){
        Scanner miConsola = new Scanner( System.in);
        System.out.println("Ingrese un numero");
        int num1 =  miConsola.nextInt();
        float suma=0;
        float num=0;
        
        while (suma<num1){
        suma++;
        num=num+suma;
        }
        System.out.println("La suma consecutiva del 0 al "+num1 +  " es: "+num);
        System.out.println("Y la media es: "+ (num/(num1+1)));
    }
    /**
     * Ingresar los numeros
     * Media de un numero
     * Suma de un numero
     * Distancia entre los numeros
     * Distinguir menor y mayode los numeros ingresados
     */
    public static void media(){
    Scanner miConsola = new Scanner( System.in);
        System.out.println("Ingrese cuanto numeros calcular");
        int cantidad;
        do {
        cantidad= miConsola.nextInt();
        int num[] = new int [cantidad];
        System.out.println("Ingrese los numeros");
        int suma=0;
        for (int i = 0; i < cantidad; i++) {
            num [i] = miConsola.nextInt();
            suma = suma + num[i];
            System.out.println("La suma es: "+ suma);
        }
        int mayor =num [0];
        int menor =num [0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor){
            mayor =num[i];
            }
            if (num[i]<menor){
            menor =num[i];
            }
        }
        int distancia = mayor-menor;
        float promedio = suma /cantidad;
        System.out.println("El promedio es: "+ promedio);
        System.out.println("El numero mayor es: "+ mayor +" y el numero menor es: "+ menor);
        System.out.println("La distancia entre los numero es: "+ distancia);
         } 
        while (cantidad==0);
    }
    public static void imprimirMensaje(String msg){
            System.out.println(msg);
    }
    /**
     * Menu
     * @param args 
     */
    public static void main(String[] args) {
        int num;
        do {
            imprimirMensaje("---------------------------------MENU--------------------------------");
            imprimirMensaje("1) Ejercicio 1: Factorial del 0 al 10");
            imprimirMensaje("2) Ejercicio 2: Suma y promedio de un numero");
            imprimirMensaje("3) Ejercicio 3: Suma, promedio, distancia, menor y mayor de un numero");
            imprimirMensaje("9) ---SALIR---");  
            Scanner miConsola = new Scanner( System.in);
            imprimirMensaje("Ingrese su opcion");
            num =  miConsola.nextInt();
            switch (num) {
            case 1:
                factorial();
                break;
            case 2:
                suma();
                break;
            case 3:
                media();
                break;    
            default:
                throw new AssertionError();
        }
        }while (num!=9);
    }
    
}
