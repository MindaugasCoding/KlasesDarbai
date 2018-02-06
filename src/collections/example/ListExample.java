package collections.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main (String[] args){

        ArrayList<String> names = new ArrayList<>();
        names.add("Andrius");
        names.add("Antanas");
        names.add("Petras");

        for(int i=0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }

        List<Integer> numbers = new LinkedList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(6);
        numbers.add(3);
        numbers.add(5);

        if(!numbers.isEmpty()){
            for(Integer numb : numbers){ //interuosis per numbers kolekcija automatiskai. Veikia visu tipu kolekcijoms
                System.out.println(numb);
            }
        }
    }
}
