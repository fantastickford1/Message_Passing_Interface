package sample;

/**
 * Created by carli on 21/11/2016.
 */
public class FirstUser extends Thread {

    private Buffer buffer;

    public FirstUser(Buffer buffer){
        this.buffer = buffer;
    };


    public void run(){
        String message;
        for (int i = 0; i < 15; i++) {
            message = buffer.getMessage();
            System.out.println("User 1 Receiving.... " + message);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
