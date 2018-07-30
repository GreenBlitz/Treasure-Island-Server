package server;
import java.io.PrintStream;

/**
 * Created by ofeke on 7/24/2018.
 */
public class Printer extends Thread{
    public int time = -3;
    private PrintStream pw;
    private Thread thread;
    private String threadName;
    private AppServer app;

    public Printer(String name, PrintStream ps, AppServer ap)
    {
        app = ap;
        threadName = name;
        pw = ps;
    }

    @Override
    public void run(){
        try {
            try {
                time = app.getTime();
            }catch (NullPointerException x){
                time = 210;
            }
            String state = "Pre";
            int help = time;
            while (time < 3.8 * 60) {
                if (time > 0) {
                    state = "Auto";
                }

                if (time > 15) {
                    state = "Tele";
                }
                if (time > 3.5 * 60) {
                    state = "Post";
                }
                System.out.println("{\"Time\":" + time + ",\"State\":" + state + ",\"Anchor1\":false,\"Anchor2\":true}");
                pw.println("{\"Time\":" + time + ",\"State\":" + state + ",\"Anchor1\":true,\"Anchor2\":true}");
                help = time+1;
                try {
                    time = app.getTime();
                }catch (NullPointerException x){
                    time = help;
                }
                Thread.sleep(990);
            }
        }catch(Exception x){
            x.printStackTrace();
        }
    }
    public void start () {
        System.out.println("Starting " +  threadName );
        if (thread == null) {
            thread = new Thread (this, threadName);
            thread.start ();
        }
    }
}
