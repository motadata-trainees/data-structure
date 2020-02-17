import org.yaml.snakeyaml.Yaml;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;
import java.io.FileInputStream;
import java.util.List;
public class test1 {
    static ArrayList<String> arr=new ArrayList<>();
    static ArrayList<HashMap<String,String>> arr1=new ArrayList<>();

    static HashMap<String,String> hm1=new HashMap<>();
    static HashMap<String,ArrayList<HashMap<String,String>>> hm=new HashMap<>();


public static void path(File folder) {
    for (File fileEntry : folder.listFiles()) {
        if (fileEntry.isDirectory()) {
            path(fileEntry);
        } else {
            arr.add(fileEntry.getAbsolutePath());

        }
    }

}



    public static void main(String[] args) throws IOException {

        Yaml yaml=new Yaml();
        File folder=new File("/home/satvik/Downloads/device-signature");
        test1.path(folder);
        for(int i=0;i<arr.size();i++){
        hm1=yaml.load(new FileInputStream(new File(arr.get(i))));

        if(hm1!=null){
            arr1.add(hm1);

        String[] st=arr.get(i).split("/");
        int n = st.length;
        if(!hm.containsKey(st[n-1])) {
            hm.put(st[n - 1], arr1);
        }
        else{
            hm.get(st[n-1]).add(hm1);

        }
        }
        }


        for(HashMap.Entry<String,ArrayList<HashMap<String,String>>> jk: hm.entrySet()){

            System.out.println(jk.getKey()+jk.getValue());
        }
        System.out.println(hm.size());

    }
}
//for finding the path of the file
// for null values count=39
//for non-null values count=33
//total 84 files.