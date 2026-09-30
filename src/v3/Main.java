package v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joan", "Puig"));
        people.add(new Person("Anna", "Serra"));
        people.add(new Person("Marc", "Puig"));
        people.add(new Person("Laia", "Font"));
        people.add(new Person("Pau", "Vila"));

        Collections.sort(people);
        System.out.println("Persons:");
        for (Person p : people) {
            p.print();
        }

        List<Rectangle> rects = new ArrayList<>();
        rects.add(new Rectangle(3, 4));
        rects.add(new Rectangle(1, 1));
        rects.add(new Rectangle(5, 2));
        rects.add(new Rectangle(2, 2));
        rects.add(new Rectangle(6, 3));

        Collections.sort(rects);
        System.out.println("Rectangles:");
        for (Rectangle r : rects) {
            r.print();
        }
    }
}
