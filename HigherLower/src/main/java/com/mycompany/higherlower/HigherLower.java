/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.higherlower;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Douglas Ryan
 */
public class HigherLower {

    public static void main(String[] args) {
        
        valores v = new valores();
         
        JFrame frame = new JFrame("Higher Or Lower");
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel campo1 = new JLabel(Integer.toString(v.getValor1()));
        campo1.setBounds(60,165,60,25);
        frame.add(campo1);
        
        JLabel title = new JLabel("Maior ou Menor?");
        title.setBounds(240,65,150,25);
        frame.add(title);
        
        JLabel campo2 =new JLabel(Integer.toString(v.getValor2()));
        campo2.setBounds(480,165,60,25);
        frame.add(campo2);
        
        JButton botaoMaior = new JButton("Maior");
        botaoMaior.setBounds(400, 150, 70, 25);
        frame.add(botaoMaior);
                
        JButton botaoMenor = new JButton("Menor");
        botaoMenor.setBounds(400,180 , 70, 25);
        frame.add(botaoMenor);
        
        JLabel lblResposta = new JLabel("");
        lblResposta.setBounds(265, 340, 200, 25);
        frame.add(lblResposta);

        JButton botaoContinuar = new JButton("Continuar");
        botaoContinuar.setBounds(240, 380, 120, 30);
        frame.add(botaoContinuar);

        botaoMaior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(v.getValor1() <= v.getValor2()){
                    lblResposta.setText("Você Acertou!");
                } else {
                    lblResposta.setText("Você Errou!");
        }
    }
});

        botaoMenor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(v.getValor1() >= v.getValor2()){
                    lblResposta.setText("Você Acertou!");
                } else {
                    lblResposta.setText("Você Errou!");
        }
    }
});
        botaoContinuar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        v.gerarNovosValores(); // gera novos valores aleatórios
        
        // Atualiza os campos na interface
        campo1.setText(Integer.toString(v.getValor1()));
        campo2.setText(Integer.toString(v.getValor2()));

        // Limpa a resposta
        lblResposta.setText("");
    }
});

    frame.setVisible(true);
    }}