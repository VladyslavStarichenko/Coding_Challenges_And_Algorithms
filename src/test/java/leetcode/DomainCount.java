package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DomainCount {
    public List<String> subdomainVisits(String[] cpdomains) {

        //Counting each subdomain-->
        HashMap<String,Integer> hmap = new HashMap<>();
        for(String cpdomain:cpdomains){
            String arr[] = cpdomain.split(" ");
            int k = Integer.parseInt(arr[0]);

            hmap.put(arr[1],hmap.getOrDefault(arr[1],0)+k);
            while(arr[1].indexOf('.')!=-1){
                arr[1] = arr[1].substring(arr[1].indexOf('.')+1);
                hmap.put(arr[1],hmap.getOrDefault(arr[1],0)+k);
            }
        }

        //Adding to list-->
        List<String> list = new ArrayList<>();
        for(String key:hmap.keySet()){
            list.add(hmap.get(key)+" "+key);
        }
        return list;
    }
}
