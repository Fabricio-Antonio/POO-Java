/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula05;

/**
 *
 * @author fassf
 */
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(206);
        p1.setDono("Cláudio");
        p1.abrirConta("CC");
        p1.depositar(250);
        p1.estadoAtual();
    }
}