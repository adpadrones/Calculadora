/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class Ejercicio3_calculadora implements ActionListener {

    private JTextField numero1;
    private JTextField numero2;
    private JTextField resultado;
    

    public Ejercicio3_calculadora(JTextField numero1, JTextField numero2, JTextField resultado) {

        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }


    public String suma() {
        double suma1 = Integer.parseInt(this.numero1.getText());
        double suma2 = Integer.parseInt(this.numero2.getText());
        return String.valueOf(suma1 + suma2);
    }

    public String resta() {
        double resta1 = Integer.parseInt(this.numero1.getText());
        double resta2 = Integer.parseInt(this.numero2.getText());
        return String.valueOf(resta1 - resta2);
    }

    public String producto() {
        double producto1 = Integer.parseInt(this.numero1.getText());
        double producto2 = Integer.parseInt(this.numero2.getText());
        return String.valueOf(producto1 * producto2);
    }

    public String division() {
        double division1 = Integer.parseInt(this.numero1.getText());
        double division2 = Integer.parseInt(this.numero2.getText());
        return String.valueOf(division1 / division2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("suma")){
        this.resultado.setText(suma());
        }
         if(ae.getActionCommand().equals("resta")){
        this.resultado.setText(resta());
         }
          if(ae.getActionCommand().equals("producto")){
        this.resultado.setText(producto());
          }
           if(ae.getActionCommand().equals("divisor"))
        this.resultado.setText(division());
    }
    

}
