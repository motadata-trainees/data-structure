import java.util.*;
import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
public class PingCollector {
    public static void ping(String ipAddress) throws UnknownHostException, IOException {
        try {
            System.out.println("Entered Ping");
            System.out.println("[ Pinging " + ipAddress + " ]");
            String[] command = {"/bin/bash", "-c", "ping -i 2 -W 2 -t 2 -c 3 " + ipAddress};
            ProcessBuilder build = new ProcessBuilder(command);
            Process process = build.start();
            BufferedReader input = new BufferedReader(new InputStreamReader
                    (process.getInputStream()));
            BufferedReader Error = new BufferedReader(new InputStreamReader
                    (process.getErrorStream()));
            String outputcollector = null;
            //System.out.println("Standard output: ");
            while ((outputcollector = input.readLine()) != null) {
                System.out.println(outputcollector);
            }
            if ((outputcollector= Error.readLine()) != null) {
                while ((outputcollector = Error.readLine()) != null) {
                    System.out.println(outputcollector);
                }
            }
            input.close();
            Error.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
