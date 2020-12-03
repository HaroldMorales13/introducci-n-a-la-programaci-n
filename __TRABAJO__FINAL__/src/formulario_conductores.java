//AUTHOR: Harold Morales 
//DATE: 25/11/2020
//DESCRIPTION: VehiculosMotoresUrbanos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_conductores extends JFrame{
    
    JButton boton_guardar;

    public formulario_conductores(){
      
        JLabel l_identificacion= new JLabel("IDENTIFICACION:");
        l_identificacion.setBounds(5, 1, 400, 20);

        JLabel l_nombre= new JLabel("NOMBRE COMPLETO:");
        l_nombre.setBounds(5, 50, 400, 20);

        JLabel l_licencia= new JLabel("LICENCIA CONDUCCION:");
        l_licencia.setBounds(5, 100, 400, 20);

        JLabel l_nacimiento= new JLabel("FECHA NACIMIENTO:");
        l_nacimiento.setBounds(5, 150, 400, 20);

        boton_guardar =new JButton("GUARDAR");
        boton_guardar.setBounds(450, 300, 100, 30);
        boton_guardar.addActionListener(new boton_clic());

        JLabel l_creador= new JLabel("Creado por:");
        l_creador.setBounds(50, 300, 100, 30);
        l_creador.setFont(new Font("Arial",9,9));
        JLabel l_creador2= new JLabel("Harold Morales Niño");
        l_creador2.setBounds(50, 310, 100, 30);
        l_creador2.setFont(new Font("Arial",9,9));

        JTextField t_identificacion =  new  JFormattedTextField ();
        t_identificacion.setBounds(110, 1, 400, 20);

        JTextField t_nombre=  new  JFormattedTextField ();
        t_nombre.setBounds(130, 50, 400, 20);

        JTextField t_licencia=  new  JFormattedTextField ();
        t_licencia.setBounds(145, 100, 400, 20);

        JTextField t_nacimiento=  new  JFormattedTextField ( " dd / mm / aa " );
        t_nacimiento.setBounds(125, 150, 400, 20);
        
        add(t_identificacion);
        add(t_nombre);
        add(t_licencia);
        add(t_nacimiento);
        add(l_creador);
        add(l_creador2);
        add(boton_guardar);
        add(l_identificacion);
        add(l_nombre);
        add(l_licencia);
        add(l_nacimiento);
        setTitle("Conductores");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

    