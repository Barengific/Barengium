package Net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServThreader {
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    //Messenger msg;
    static volatile boolean connState1 = false;
    static volatile boolean connState2 = false;
    static volatile boolean finState1 = false;
    static volatile boolean finState2 = false;
    static volatile int level = 1;

    //constructor to get the same socket from Server
    public ServThreader(Socket socket, int pNo) {
        this.socket = socket;
    }

    // thread keeps both  updated
    @Override
    public synchronized void run() {
        //ArrayList<Scoreboard> lists = readScore();
        try {
            ois = new ObjectInputStream(socket.getInputStream());
            while (true) {

            }//count .. seconds before reseting states and

        } catch (IOException ex) {
            System.out.println("" + ex);
        }
    }

}
