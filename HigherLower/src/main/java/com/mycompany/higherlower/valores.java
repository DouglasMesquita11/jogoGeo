/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.higherlower;
import java.util.Random;
/**
 *
 * @author Douglas Ryan
 */
public class valores {
    Random aleatorio= new Random();
    
    private int valor1 = aleatorio.nextInt(1000);
    private int valor2 = aleatorio.nextInt(1000);
    public valores() {
        gerarNovosValores();
    }
    
    public void gerarNovosValores() {
        valor1 = aleatorio.nextInt(1000);
        valor2 = aleatorio.nextInt(1000);
    }
    public int getValor1(){
            return valor1;
        }
    public int getValor2() {
        return valor2;
    }
    public void setValor1(int valor1) {
        this.valor1=valor1;
    }
    public void setValor2(int valor2) {
        this.valor2=valor2;
    }
}
