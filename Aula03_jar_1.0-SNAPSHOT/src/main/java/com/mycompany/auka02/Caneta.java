/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auka02;

/**
 *
 * @author fassf
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status () {
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Está tampada?" + this.tampada);
        
    }
    
    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    protected void tampar () {
        this.tampada = true;
    }
    protected void destampar () {
        this.tampada = false;
    }
}
