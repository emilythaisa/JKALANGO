package br.com.jkalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JIntro extends JFrame {

        public JIntro(){
//formulário
            setTitle("O Game POO de TERROR");
            setSize(500, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new FlowLayout());

            //colocar cor
            getContentPane().setBackground(Color.BLACK);

//botão com o título Start
        JButton starButton = new JButton("Iniciar a primeira missão");
        add(starButton); 
        starButton.setForeground(Color.WHITE);          
        starButton.setBackground(Color.DARK_GRAY);      
        starButton.setFocusPainted(false); 


        

// adicionar um evento ao botão 
    starButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed (ActionEvent e) {
            JOptionPane.showMessageDialog(JIntro.this, "Em mundo distante... \n Jkalango é um calango do cerrado mágico em busca \n de preservar a sua espécie e de seus amigos \n JFormigas e JAbelhinhas e \n para isso deverá enfrentar diversas missões");
            JOptionPane.showMessageDialog(JIntro.this, "Primeira missão iniciada");
        }



    });
// mostrar o formulário        
    setVisible(true);
}  
}

