package lession6.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        new Client().start("localHost",8189);
    }
    public void start(String host,int port) throws IOException {
        Socket socket = null;
        Thread inputThread = null;
        try {
            socket = new Socket(host, port);
            System.out.println("Клиент запущен");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            inputThread = runInputThread(in);
            runOutputLoop(out);


        } finally {
            if (inputThread != null) inputThread.interrupt();
            if (socket != null) socket.close();
        }
    }

    private void runOutputLoop(DataOutputStream out) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.next();
            out.writeUTF(message);
            if (message.equals("/end")) {
                break;
            }
        }
    }

    private Thread runInputThread(DataInputStream in) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String message = in.readUTF();
                    System.out.println("From server: " + message);
                    if (message.equals("/end")) {
                        System.exit(0);
                    }
                } catch (IOException e) {
                    System.out.println("Connection was closed");
                    break;
                }
            }
        });
        thread.start();
        return thread;
    }
}
