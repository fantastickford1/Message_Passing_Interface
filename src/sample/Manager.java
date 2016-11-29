package sample;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by carli on 21/11/2016.
 */
public class Manager extends Thread {

    private Buffer buffer;
    private final String[] messages = {"Welcome","To","The","Seventh","Hunger","Games","May","The","Odds","Be","Ever","In","Your","Favor"};

    public Manager(Buffer buffer){
        this.buffer = buffer;
    }


    public void run(){

        try {
            for (String message :
                 messages) {
                buffer.setMessage(message);
                System.out.println("Sending message...");
                sleep(100);
            }
        }catch (InterruptedException e){
            e.getMessage();
        }

    }


}
