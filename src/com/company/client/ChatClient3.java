package com.company.client;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatClient3 {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
//        client.start();

        client.sendMessage("Hi!.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        client.sendMessage("name," + name);

//        client.sendMessage("exit");

        System.out.println("Client Finished");

    }
}
