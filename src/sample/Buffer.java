package sample;

/**
 * Created by carli on 27/11/2016.
 */
public class Buffer {

    private String message;
    private boolean full = false;

    public synchronized String getMessage(){
        while(!full){
            try{
                wait();
            }catch(InterruptedException ex){}
        }
        full=false;
        notify();
        return message;
    }

    public synchronized void setMessage(String data){
        while (full){
            try {
                wait();
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
        message = data;
        full = true;
        notify();

    }

}
