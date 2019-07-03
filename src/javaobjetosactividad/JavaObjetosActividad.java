/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjetosactividad;

import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class JavaObjetosActividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        String placa,marca,color;
        int modelo,kilometraje;
      carro carro1;
      System.out.println("Ingrese la placa");
      placa= leer.next();
      System.out.println("Ingrese la marca");
      marca= leer.next();
      System.out.println("Ingrese el modelo");
      modelo= leer.nextInt();
      System.out.println("Ingrese el color");
      color= leer.next();
      System.out.println("Ingrese el kilometraje");
      kilometraje= leer.nextInt();
      carro1 = new carro(placa,marca,modelo,color,kilometraje);
      System.out.println(carro1.mostrar());
      System.out.println("Digite el nuevo kilometraje");
      kilometraje=leer.nextInt();
      carro1.setKilometraje(kilometraje);
      System.out.println(carro1.mostrar());

    }
    
}
