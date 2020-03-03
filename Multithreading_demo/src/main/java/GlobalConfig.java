import java.util.*;
import org.yaml.snakeyaml.Yaml;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class GlobalConfig {

    private static HashMap<String,Integer> configuration = new HashMap<>();
    private static BlockingQueue<String> collectorQueue = new LinkedBlockingQueue<String>();
    static AtomicBoolean isShutdown = new AtomicBoolean(false);

    public static void fetch() throws IOException {
        try {
            Yaml yaml = new Yaml();
            String path = "/home/ravi/Desktop/ping.yml";
            configuration=yaml.load(new FileInputStream(new File(path)));
            System.out.println(configuration);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static HashMap<String,Integer> getConfiguration()
    {
        return configuration;
    }
    public static void requestCollector(String task)
    {
        try {
            collectorQueue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static String takeTask()
    {
        String task = null;

        try {
            task = collectorQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return task;
    }
    public static void isShutdownSet(Boolean setisShutdown)
    {
       if(setisShutdown)
       {
           isShutdown.set(setisShutdown);
       }
    }
    public static boolean isShutdownGet()
    {
        boolean getisShutdown=isShutdown.get();
        return getisShutdown;
    }
    public static int get_Value(String Key) {
        int value = configuration.get(Key);
                return value;
    }
 }
