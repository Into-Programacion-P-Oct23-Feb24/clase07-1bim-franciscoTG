/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 5;
        int contador = 1;
        int suma = 0;
        int valor_ingresado;
        
        while (contador <= limite) { 
            System.out.println("Ingrese el valor a sumar"); // Una estructura bucle que se usa para repetir el ciclo
            valor_ingresado = entrada.nextInt(); // Entrada de dato entero
            suma = suma + valor_ingresado; // Suma de los valores ingresados
            System.out.printf("Valor ingresado %d\n", valor_ingresado);// Presentar el valor ingresado en pantalla
            contador = contador + 1; // Aumenta el contador
        }

        System.out.printf("La suma final es %d\n", suma);

    }
}

