/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjetosactividad;

/**
 *
 * @author CBN
 */
public class carro {
    private String placa,marca,color;
    private int modelo,kilometraje;
    public carro(String placa,String marca,int modelo, String color,int kilometraje){
        this.placa = placa;
        this.marca= marca;
        this.modelo= modelo;
        this.color = color;
        this.kilometraje=kilometraje;      
    }
 public String mostrar(){
        String resultado ="";
        resultado = placa + "" + marca + "" + color + "" + Integer.toString(modelo) + "" + Integer.toString(kilometraje);
        return resultado;
 }   
 public void setKilometraje(int kilometraje){
    this.kilometraje= kilometraje;
    System.out.println("Cambio de kilometraje realizado");
}
}
