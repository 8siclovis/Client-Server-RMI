package br.com.clientserver.Cliente;

import br.com.clientserver.RMI.RemoteInterface;
import br.com.clientserver.Servidor.MainServer;

import javax.swing.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        try {

        Registry registry = LocateRegistry.getRegistry("127.0.0.1",1244);
        RemoteInterface s =(RemoteInterface) registry.lookup("Cryptogram");



            while (true) {
                String A;

                String[] options = new String[]{"Criptografar", "Descriptografar", "Sair"};
                int resposta = JOptionPane.showOptionDialog(null, "Escolha:", "OPÇÕES",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);



                if (resposta == 0) {
                    // Essa parte Criptografa o Texto
                    A = JOptionPane.showInputDialog("Criptografar texto");
                    JOptionPane.showMessageDialog(null,"\n"+s.criptografar(A));
                }
                if (resposta == 1) {
                    // Essa parte Decifra o texto
                    A = JOptionPane.showInputDialog("Descriptografar texto");
                    JOptionPane.showMessageDialog(null,"\n"+s.descriptografar(A));

                }
                if (resposta == 2) {
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    System.exit(0);
                }
            }
        }
        catch (Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        }
    }
}
