/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.*;
import java.io.*;
import java.sql.*;


/**
 *
 * @author tshep
 */
public class clientSession implements Runnable{
    
    Socket soc;
    BufferedReader br;
    PrintWriter pw;
    Thread runner;
    ServerConnection dbConn;
    
    clientSession(Socket s) {
        try {
            soc = s;
            br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            pw = new PrintWriter(new BufferedOutputStream(soc.getOutputStream()), true);

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    
    }
    


public void introduceThread() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

public void run() {
        //this method contains all the code to decide whether the client wants to search, 
        //insert, or delete.
        
        while (runner == Thread.currentThread()) {
            
                   dbConn = new ServerConnection();
                   dbConn.getConnection();
                
            }
 
        }
    }
