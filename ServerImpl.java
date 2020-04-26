package br.com.clientserver;

import br.com.clientserver.RMI.RemoteInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements RemoteInterface {

    public ServerImpl() throws Exception{
        super();
    }


    @Override
    public String criptografar(String a) throws RemoteException {
        char charArray[];
        char charAux= ' ';
        String output = "Texto: "+a;
        int tam = a.length();
        charArray = new char[tam];
        output += "\n\nCriptografado: ";

        // obtem cadeia de caracteres e  a coloca em um vetor de char.
        a.getChars(0,tam, charArray, 0);

        for (int cont=0; cont< charArray.length;cont++){

            if(charArray[cont]==' ') charAux=' ';
            if(charArray[cont]=='A' || charArray[cont]=='a') charAux ='f';
            if(charArray[cont]=='B' || charArray[cont]=='b') charAux ='j';
            if(charArray[cont]=='C' || charArray[cont]=='c') charAux ='h';
            if(charArray[cont]=='D' || charArray[cont]=='d') charAux ='r';
            if(charArray[cont]=='E' || charArray[cont]=='e') charAux ='p';
            if(charArray[cont]=='F' || charArray[cont]=='f') charAux ='l';
            if(charArray[cont]=='G' || charArray[cont]=='g') charAux ='k';
            if(charArray[cont]=='H' || charArray[cont]=='h') charAux ='z';
            if(charArray[cont]=='I' || charArray[cont]=='i') charAux ='s';
            if(charArray[cont]=='J' || charArray[cont]=='j') charAux ='o';
            if(charArray[cont]=='K' || charArray[cont]=='k') charAux ='u';
            if(charArray[cont]=='L' || charArray[cont]=='l') charAux ='i';
            if(charArray[cont]=='M' || charArray[cont]=='m') charAux ='b';
            if(charArray[cont]=='N' || charArray[cont]=='n') charAux ='v';
            if(charArray[cont]=='O' || charArray[cont]=='o') charAux ='m';
            if(charArray[cont]=='P' || charArray[cont]=='p') charAux ='n';
            if(charArray[cont]=='Q' || charArray[cont]=='q') charAux ='c';
            if(charArray[cont]=='R' || charArray[cont]=='r') charAux ='x';
            if(charArray[cont]=='S' || charArray[cont]=='s') charAux ='a';
            if(charArray[cont]=='T' || charArray[cont]=='t') charAux ='d';
            if(charArray[cont]=='U' || charArray[cont]=='u') charAux ='g';
            if(charArray[cont]=='V' || charArray[cont]=='v') charAux ='q';
            if(charArray[cont]=='X' || charArray[cont]=='x') charAux ='e';
            if(charArray[cont]=='Z' || charArray[cont]=='z') charAux ='t';
            if(charArray[cont]=='Y' || charArray[cont]=='y') charAux ='w';
            if(charArray[cont]=='W' || charArray[cont]=='w') charAux ='y';

            charArray[cont] = charAux;
            output += charArray[cont];
        }
        return output;
    }

    @Override
    public String descriptografar(String a) throws RemoteException {
        char charArray[];
        char charAux= ' ';
        String output = "Texto Criptografado "+ a;
        int tam = a.length();
        charArray = new char[tam];
        output +="\n\nTexto Legível: ";

        //Obtem cadeia de caracteres e a coloca em um vetor de char.
        a.getChars(0,tam,charArray,0);

        for (int cont=0; cont< charArray.length;cont++){

            if(charArray[cont]==' ') charAux=' ';
            if(charArray[cont]=='A' || charArray[cont]=='a') charAux ='s';
            if(charArray[cont]=='B' || charArray[cont]=='b') charAux ='m';
            if(charArray[cont]=='C' || charArray[cont]=='c') charAux ='q';
            if(charArray[cont]=='D' || charArray[cont]=='d') charAux ='t';
            if(charArray[cont]=='E' || charArray[cont]=='e') charAux ='x';
            if(charArray[cont]=='F' || charArray[cont]=='f') charAux ='a';
            if(charArray[cont]=='G' || charArray[cont]=='g') charAux ='u';
            if(charArray[cont]=='H' || charArray[cont]=='h') charAux ='c';
            if(charArray[cont]=='I' || charArray[cont]=='i') charAux ='l';
            if(charArray[cont]=='J' || charArray[cont]=='j') charAux ='b';
            if(charArray[cont]=='K' || charArray[cont]=='k') charAux ='g';
            if(charArray[cont]=='L' || charArray[cont]=='l') charAux ='f';
            if(charArray[cont]=='M' || charArray[cont]=='m') charAux ='o';
            if(charArray[cont]=='N' || charArray[cont]=='n') charAux ='p';
            if(charArray[cont]=='O' || charArray[cont]=='o') charAux ='j';
            if(charArray[cont]=='P' || charArray[cont]=='p') charAux ='e';
            if(charArray[cont]=='Q' || charArray[cont]=='q') charAux ='v';
            if(charArray[cont]=='R' || charArray[cont]=='r') charAux ='d';
            if(charArray[cont]=='S' || charArray[cont]=='s') charAux ='i';
            if(charArray[cont]=='T' || charArray[cont]=='t') charAux ='z';
            if(charArray[cont]=='U' || charArray[cont]=='u') charAux ='k';
            if(charArray[cont]=='V' || charArray[cont]=='v') charAux ='n';
            if(charArray[cont]=='X' || charArray[cont]=='x') charAux ='r';
            if(charArray[cont]=='Z' || charArray[cont]=='z') charAux ='h';
            if(charArray[cont]=='Y' || charArray[cont]=='y') charAux ='w';
            if(charArray[cont]=='W' || charArray[cont]=='w') charAux ='y';

            charArray[cont] = charAux;
            output += charArray[cont];
        }
        return output;
    }
}
