import java.util.*;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;


public class MetricSchedular extends Thread
{
    public void run() {
        try {
            System.out.println("Entered the schedular Thread");
            while (!GlobalConfig.isShutdownGet()) {
                    HashMap<String, Integer> configuration = GlobalConfig.getConfiguration();
                    for (HashMap.Entry<String, Integer> entry : configuration.entrySet()) {
                        entry.setValue(entry.getValue() - 10);
                        if (entry.getValue() < 0) {
                            GlobalConfig.requestCollector(entry.getKey());
                            entry.setValue(GlobalConfig.get_Value(entry.getKey()));
                        }
                    }
                    Thread.sleep(10000);
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
