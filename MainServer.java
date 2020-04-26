package br.com.clientserver.Servidor;

import br.com.clientserver.ServerImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainServer {

    public static void main (String args[]){
        try {
            Registry registry = LocateRegistry.createRegistry(1244);
            registry.rebind("Cryptogram", new ServerImpl());
            System.out.println("Server On");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
