package sample;

import java.util.ArrayList;

/**
 * Created by carli on 27/11/2016.
 */
public class Main {



    public static void main(String[] args){
        Buffer bufer = new Buffer();

        Manager manager = new Manager(bufer);
        FirstUser firstUser= new FirstUser(bufer);
        manager.start();
        firstUser.start();

    }
}
