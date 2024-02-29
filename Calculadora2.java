package com.mycompany.calculadora2;

import javax.swing.JOptionPane;
public class Calculadora2 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 2"));
        
      Operaciones op = new Operaciones();
      op.sumar(n1, n2);
      op.restar(n1, n2);
      op.multiplicar(n1, n2);
      op.division(n1, n2);
      op.porcentaje(n1, n2);
      op.mostarResusltados();
    }
}
