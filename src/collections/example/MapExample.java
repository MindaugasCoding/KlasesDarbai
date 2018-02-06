package collections.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args){

        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(12, "Andrius");
        namesMap.put(1, "Jonas");
        namesMap.put(3, "Antanas");
        namesMap.put(6, "Andrius");

        for(Integer key : namesMap.keySet()){
            System.out.println("key: " + key + " value " + namesMap.get(key));
        }
    }
}
