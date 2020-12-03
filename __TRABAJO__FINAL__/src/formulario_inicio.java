//AUTHOR: Harold Morales 
//DATE: 25/11/2020
//DESCRIPTION: FormularioMotoresUrbanos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_inicio extends JFrame{
    
    JButton boton_inicio;

    public formulario_inicio(){
        JLabel l_title = new JLabel ("Software Motores Urbanos");
        l_title.setBounds(200, 10, 500, 20);

        JLabel l_version= new JLabel("Version 1.0");
        l_version.setBounds(300, 300, 400, 20);

        boton_inicio =new JButton("Empezar");
        boton_inicio.setBounds(250, 130, 100, 40);
        boton_inicio.addActionListener(new boton_clic());

        JLabel l_creador= new JLabel("Creado por:");
        l_creador.setBounds(50, 300, 100, 30);
        l_creador.setFont(new Font("Arial",9,9));
        JLabel l_creador2= new JLabel("Harold Morales Niño");
        l_creador2.setBounds(50, 310, 100, 30);
        l_creador2.setFont(new Font("Arial",9,9));

        add(l_creador);
        add(l_creador2);
        add(l_version);
        add(l_title);
        add(boton_inicio);
        setTitle("Software 5inal Del Semestre");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

class boton_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        formulario_principal form_principal =new formulario_principal();
    }
}
