/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodificadoradn;

import java.util.Scanner;

/**
 *
 * @author erikssonherlo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner elegir = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Tarea No. 1");
            System.out.println("ANALIZADOR ADN");
            System.out.println("1. Comparar ADN");
            System.out.println("2. Información del Estudiante");
            System.out.println("3. Salir");
            System.out.println("Escribe el numero correspondiente a la Seleccion");

            int opcion = elegir.nextInt();

            switch (opcion) {
                case 1:
                    
                    AnalizadorADN LlamarA = new AnalizadorADN();
                    LlamarA.Analizar();
                    break;

                case 2:
                  Informacion Informar = new Informacion();
                    Informar.Info();
                    break;

                case 3:
                    System.out.println("Salir");
                    salir = true;
                    break;

                default:
                    System.out.println("Elegir entre las Opciones (1-3)");
            }
        }
        // TODO code application logic here
    }
    
}
