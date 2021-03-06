package com.company.client;

import java.io.*;
import java.net.Socket;

public class Client {

    private DataOutputStream outputStream;
    private BufferedReader bufferedReader;

    //constructor-start
    public Client() throws IOException {
        System.out.println("Client is running ...");
        Socket socket = new Socket("localhost", 6000);

        //InputStream, outputStream
        this.outputStream = new DataOutputStream(socket.getOutputStream());
        InputStream inputStream = socket.getInputStream();
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    }

     public  void  sendMessage(String message) throws IOException {
         System.out.println("Client Says : "+ message);
         this.outputStream.writeBytes(message + "\n");
         String dataFromServer = this.bufferedReader.readLine();
         System.out.println("Server Says : " + dataFromServer);
     }
}
