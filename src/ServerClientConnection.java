import java.io.*;
import java.net.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tshep
 */


/**
 * This is the class for the server client connection
*/


public class ServerClientConnection {
    boolean listening;

    public void serverToClient() {
        ServerSocket server = null;
        //String line;
        Socket clientSocket;
        System.out.println("Greetings Starting up....");
        try {
            server = new ServerSocket(16000);
            listening = true;
            System.out.println("Server socket listening on port 16000");
        } catch (IOException e) {
            System.out.println(e);
        }
        while (listening) {
            try {
                System.out.println("Waiting for connection...");
                clientSocket = server.accept();
                clientSession sess = new clientSession(clientSocket);
                sess.introduceThread();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    } 
}
