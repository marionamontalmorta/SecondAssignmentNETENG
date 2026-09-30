package v2;

public class Person implements Sortable {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println(name + " " + surname);
    }

    @Override
    public boolean isBigger(Sortable other) {
        Person o = (Person) other;
        int c = o.surname.compareTo(surname);
        if (c != 0) {
            return c > 0;
        }
        return o.name.compareTo(name) > 0;
    }
}
