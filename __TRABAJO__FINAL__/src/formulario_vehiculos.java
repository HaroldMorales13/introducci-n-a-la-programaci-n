//AUTHOR: Harold Morales 
//DATE: 25/11/2020
//DESCRIPTION: VehiculosMotoresUrbanos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_vehiculos extends JFrame{

    JButton boton_guardar;
    JButton boton_detalle;
    JButton boton_imprimir;

    public formulario_vehiculos(){
        
        JLabel l_placa= new JLabel("PLACA:");
        l_placa.setBounds(5, 1, 400, 20);

        JLabel l_matricula= new JLabel("FECHA MATRICULA:");
        l_matricula.setBounds(5, 50, 400, 20);

        JLabel l_puestos= new JLabel("CANTIDAD PUESTOS:");
        l_puestos.setBounds(5, 100, 400, 20);

        JLabel l_propietario= new JLabel("PROPIETARIO:");
        l_propietario.setBounds(5, 150, 400, 20);

        boton_guardar =new JButton("GUARDAR");
        boton_guardar.setBounds(250, 300, 100, 30);
        boton_guardar.addActionListener(new boton_clic());

        boton_detalle =new JButton("VER DETALLE");
        boton_detalle.setBounds(350, 300, 100, 30);
        boton_detalle.addActionListener(new boton_clic());

        boton_imprimir =new JButton("IMPRIMIR");
        boton_imprimir.setBounds(450, 300, 100, 30);
        boton_imprimir.addActionListener(new boton_clic());

        JLabel l_creador= new JLabel("Creado por:");
        l_creador.setBounds(50, 300, 100, 30);
        l_creador.setFont(new Font("Arial",9,9));
        JLabel l_creador2= new JLabel("Harold Morales Niño");
        l_creador2.setBounds(50, 310, 100, 30);
        l_creador2.setFont(new Font("Arial",9,9));

        JTextField t_placa=  new  JFormattedTextField ();
        t_placa.setBounds(110, 1, 400, 20);

        JTextField t_puestos=  new  JFormattedTextField ();
        t_puestos.setBounds(130, 50, 400, 20);

        JTextField t_matricula=  new  JFormattedTextField ();
        t_matricula.setBounds(145, 100, 400, 20);

        JTextField t_propietario=  new  JFormattedTextField ();
        t_propietario.setBounds(125, 150, 400, 20);
        
        add(t_placa);
        add(t_puestos);
        add(t_matricula);
        add(t_propietario);

        add(l_creador);
        add(l_creador2);
        add(boton_detalle);
        add(boton_guardar);
        add(boton_imprimir);
        add(l_placa);
        add(l_matricula);
        add(l_puestos);
        add(l_propietario);
        setTitle("Vehiculos");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

    