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
public class AnalizadorADN {
     String Analisis1, Analisis2, Coincidencias = "";
    int tamaño1, tamaño2;
    int entrar;
    int aux=0;
    public AnalizadorADN() {
        //Metodo Constructor
    }

    public void Analizar() {
        System.out.println("Ingrese la Primera Cadena de ADN a Analizar:");
        Scanner A1 = new Scanner(System.in);
        Analisis1 = A1.nextLine();
        tamaño1 = Analisis1.length();
        System.out.println("Ingrese la Segunda Cadena de ADN a Analizar:");
        Scanner A2 = new Scanner(System.in);
        Analisis2 = A2.nextLine();
        tamaño2 = Analisis2.length();
        if(tamaño1>=tamaño2){
            aux=1;
        } else if(tamaño2>=tamaño1){
            aux=2;
        }
        
        switch (aux) {
            case 1:
            for (int i = tamaño1; i >= 0; i--)
            { 
                
                for (int c = 0; c < i; c++) 
                {    
                if (Analisis2.contains(Analisis1.substring(c, i)) &&    
                    Coincidencias.length() < Analisis1.substring(c, i).length()) 
                {
                  Coincidencias = Analisis1.substring(c, i);                  
                  System.out.println("Posible Patron: "+ Coincidencias);
                }  
                }
            }
            System.out.println("Resultado con mayor Coincidencia: "+ Coincidencias+"\n");
            break;
            case 2:
            for (int i = tamaño2; i >= 0; i--)
            { 
                for (int c = 0; c < i; c++) 
                {    
                if (Analisis1.contains(Analisis2.substring(c, i)) &&    
                    Coincidencias.length() < Analisis2.substring(c, i).length()) 
                {
                  Coincidencias = Analisis2.substring(c, i);                  
                  System.out.println("Posible Patron: "+ Coincidencias);
                }  
                }
            }
            System.out.println("Resultado con mayor Coincidencia: "+ Coincidencias+"\n");
            break;

            default:
            System.out.println("No se pudo realizar el Analisis, debido a que una de las cadenas de texto esta vacia\n");
            }
        }
    
}
