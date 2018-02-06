package collections.example;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args){

        Set<String> names = new TreeSet<>();
        names.add("Petras");
        names.add("Jonas");
        names.add("Antanas");
        names.add("Giedrius");
        names.add("Mindaugas");
        names.add("Andrius");
        names.add("Petras");

        for(String name : names){
            System.out.println(name);
        }
    }
}
