//AUTHOR: Harold Morales 
//DATE: 25/11/2020
//DESCRIPTION: AcercaDeMotoresUrbanos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_acercade extends JFrame{

    JButton boton_volver;

    public formulario_acercade(){
        JLabel l_title = new JLabel ("Acerca De");
        l_title.setBounds(200, 10, 500, 20);

        JLabel l_desarrollador= new JLabel("DESARROLLADOR: Harold Steeven Morales Niño");
        l_desarrollador.setBounds(10, 100, 400, 20);

        JLabel l_facultad= new JLabel("FACULTAD: Ingeniera De Sistemas ");
        l_facultad.setBounds(10, 150, 400, 20);

        JLabel l_correo= new JLabel("CORREO: harold.morales@usantoto.edu.co");
        l_correo.setBounds(10, 200, 400, 20);

        JLabel l_github= new JLabel("GITHUB:https://github.com/HaroldMorales13/introducci-n-a-la-programaci-n");
        l_github.setBounds(10, 250, 400, 20);

        boton_volver =new JButton("VOLVER");
        boton_volver.setBounds(450, 300, 100, 30);
        boton_volver.addActionListener(new boton_clic());
        
        JLabel l_creador= new JLabel("Creado por:");
        l_creador.setBounds(50, 300, 100, 30);
        l_creador.setFont(new Font("Arial",9,9));
        JLabel l_creador2= new JLabel("Harold Morales Niño");
        l_creador2.setBounds(50, 310, 100, 30);
        l_creador2.setFont(new Font("Arial",9,9));

        add(l_creador);
        add(l_creador2);
        add(boton_volver);
        add(l_desarrollador);
        add(l_title);
        add(l_correo);
        add(l_facultad);
        add(l_github);
        setTitle("Acerca De");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}