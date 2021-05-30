package com.company.client;

import java.io.IOException;

public class ChatClient2 {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();

        client.sendMessage("Hello from the Client.");
        client.sendMessage("How are you?");
        client.sendMessage("I'm fine.");
        client.sendMessage("Thank You.");
        client.sendMessage("exit");


        System.out.println("Client Finished");
//        // write your code here
//
//        System.out.println("Client is running ...");
//        Socket socket = new Socket("localhost", 6000);
//
//        //InputStream, outputStream
//        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//        dataOutputStream.writeBytes("Hello from Client 1 \n");
//        dataOutputStream.writeBytes("Hello from Client 2\n");
//        dataOutputStream.writeBytes("Hello from Client 3\n");
//        dataOutputStream.writeBytes("exit\n");
//
//        //get data from server
//        InputStream inputStream = socket.getInputStream();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        String receivedData =  bufferedReader.readLine();
//
//        System.out.println("Received Data : " + receivedData);

    }
}
