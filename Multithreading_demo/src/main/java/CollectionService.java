import java.io.*;

public class CollectionService extends Thread {


    public void run()
    {
        try {
            while (!GlobalConfig.isShutdownGet()) {
                String item = GlobalConfig.takeTask();
                System.out.println("CollectionService "+" [ Pinging  " + item+" ]");
                try{
                PingCollector.ping(item);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        finally
        {
            if(!GlobalConfig.isShutdownGet()){

                run();
            }
        }
    }
}
