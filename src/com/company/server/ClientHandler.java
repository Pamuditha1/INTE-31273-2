package com.company.server;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket client;

    public ClientHandler(Socket socket) {
        this.client = socket;
    }

    @Override
    public void run() {
        try {
//            Thread.sleep(20000);

            //receive
            InputStream inputStream = client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            //continuous data from client
            String inputData;
            while ((inputData = bufferedReader.readLine()) != null ) {
                System.out.println("Client says : "+ inputData);

                //send data to client
                switch (inputData) {
                    case "Hello from the Client." :
                        outputStream.writeBytes("Hello from the Server...\n");
                        break;
                    case "How are you?" :
                        outputStream.writeBytes("I am fine, how are you? \n");
                        break;
                    case "I'm fine." :
                        outputStream.writeBytes("Okay, good to know. \n");
                        break;
                    case "Thank You." :
                        outputStream.writeBytes("You are welcome. \n");
                        break;
                    case "Hi!." :
                        outputStream.writeBytes("Enter Your name : \n");
                        break;
//                    case inputData.contains("name") :
//                        var data = inputData;
//                        var name = data.split(",")[1];
//                        outputStream.writeBytes("Name entered is " + name + "\n");
//                        break;

                    default:
                        outputStream.writeBytes("I did't understand that. \n");
                }

                if(inputData.equals("exit")) {
                    break;
                }
            }
            this.client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
