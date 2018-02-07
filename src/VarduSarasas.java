import java.util.ArrayList;
        import java.util.List;

public class VarduSarasas {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Petras");
        names.add("Jonas");
        names.add("Antanas");
        names.add("Audrius");
        names.add("Mindaugas");

        /*for (String name : names) {
            if (name.length() > 6) {
                System.out.println(name);
            }
        }*/
        String pirmasEl = pirmasVardas(names);
        System.out.println(pirmasEl);
        String antrasEl = antrasVardas(names);
        System.out.println(antrasEl);
    }

    private static String pirmasVardas(List<String> names) {
        return names.get(0);

    }

    private static String antrasVardas(List<String> names) {
        return names.get(names.size() - 1);
    }
}
