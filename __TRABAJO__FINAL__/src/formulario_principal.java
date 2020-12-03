//AUTHOR: Harold Morales 
//DATE: 25/11/2020
//DESCRIPTION: FormularioMotoresUrbanos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_principal extends JFrame{
    
    JButton boton_inicio;

    public formulario_principal(){
        
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel ("Menu Principal");
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);

        JLabel l_nombre= new JLabel("Creado por: Harold Steeven Morales");
        l_nombre.setBounds(450, 300, 100, 30);
        l_nombre.setFont(new Font("Times New Roman",0,20));

        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3,1));

        JButton boton_conductores = new JButton("Conductores");
        boton_conductores.setBounds(2, 0, 100, 30);
        boton_conductores.addActionListener(new boton_conductores_clic());

        JButton boton_vehiculo = new JButton("Vehiculos");
        boton_vehiculo.setBounds(2, 0, 100, 30);
        boton_vehiculo.addActionListener(new boton_vehiculo_clic());

        JButton boton_acercade = new JButton("Acerca De...");
        boton_acercade.setBounds(2, 0, 100, 30);
        boton_acercade.addActionListener(new boton_acercade_clic());

        panel_izquierdo.add(boton_conductores);
        panel_izquierdo.add(boton_vehiculo);
        panel_izquierdo.add(boton_acercade);

        add(panel_superior,BorderLayout.NORTH);
        add(panel_izquierdo,BorderLayout.WEST);
        
        setTitle("Menu Principal");
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}


class boton_conductores_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        formulario_conductores form_conductores =new formulario_conductores();

    }
}

class boton_vehiculo_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        formulario_vehiculos form_vehiculos =new formulario_vehiculos();
    }
}

class boton_acercade_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        formulario_acercade form_acerca =new formulario_acercade();

    }
}
