package a0208;

import javax.swing.*;

public class HelloWorld {

    public static void main(String[] args){
        exibeNome();
        System.out.println("Olâ Mundo!");

    }

    public static void exibeNome(){
        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");

        JOptionPane.showMessageDialog(null, nome);

        System.out.println(nome);
    }
}
