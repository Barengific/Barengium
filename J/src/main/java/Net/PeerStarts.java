package Net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PeerStarts {
    //server variables creation
    static final int port = 1234;
    static ServerSocket ssocket;
    static Socket socket;

    public static void main(String[] args) throws IOException, IOException {
        ssocket = new ServerSocket(port);

        int player = 1;
        while (true) {
            System.out.println("listening" + player);
            socket = ssocket.accept();
            if (player == 1) {
                ServThreader thread = new ServThreader(socket, player);
                thread.start();
                player = 2;
            }
        }
    }


}
