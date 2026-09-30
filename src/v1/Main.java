package v1;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Joan", "Puig"),
            new Person("Anna", "Serra"),
            new Person("Marc", "Puig"),
            new Person("Laia", "Font"),
            new Person("Pau", "Vila")
        };

        new Sorter().sort(people);

        for (Person p : people) {
            p.print();
        }
    }
}
