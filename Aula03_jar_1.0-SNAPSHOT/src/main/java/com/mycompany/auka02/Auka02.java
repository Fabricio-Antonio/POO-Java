/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.auka02;

/**
 *
 * @author fassf
 */
public class Auka02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Caneta Boa";
        c1.cor = "Preta";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
  
    }
}
