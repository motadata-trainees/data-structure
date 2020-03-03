import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Bootmanager {
    public static void main(String [] args) throws IOException
    {
        try {
            GlobalConfig.fetch();
            MetricSchedular Schedular = new MetricSchedular();
            CollectionService Pingtask = new CollectionService();
            Schedular.start();
            Pingtask.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
