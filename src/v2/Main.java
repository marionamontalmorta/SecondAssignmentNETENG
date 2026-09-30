package v2;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        Person[] people = {
            new Person("Joan", "Puig"),
            new Person("Anna", "Serra"),
            new Person("Marc", "Puig"),
            new Person("Laia", "Font"),
            new Person("Pau", "Vila")
        };
        sorter.sort(people);
        System.out.println("Persones:");
        for (Person p : people) {
            p.print();
        }

        Rectangle[] rects = {
            new Rectangle(3, 4),
            new Rectangle(1, 1),
            new Rectangle(5, 2),
            new Rectangle(2, 2),
            new Rectangle(6, 3)
        };
        sorter.sort(rects);
        System.out.println("Rectangles:");
        for (Rectangle r : rects) {
            r.print();
        }
    }
}
