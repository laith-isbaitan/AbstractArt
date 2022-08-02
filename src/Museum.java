import java.util.ArrayList;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> artArray = new ArrayList<>();
        Painting p = new Painting();
        Painting p2 = new Painting();
        Painting p3= new Painting();

        Sculptue s = new Sculptue();
        Sculptue s2 = new Sculptue();
        artArray.add(p);
        artArray.add(p2);
        artArray.add(p3);
        artArray.add(s);
        artArray.add(s2);

        for (Art art:artArray) {
            System.out.println(art.toString());
        }
    }
}
