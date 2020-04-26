package br.com.clientserver.RMI;

import java.rmi.Remote;

public interface RemoteInterface extends Remote {


    public String criptografar (String a) throws java.rmi.RemoteException;
    public String descriptografar (String a) throws java.rmi.RemoteException;

}
