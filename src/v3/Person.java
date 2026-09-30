package v3;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println(name + " " + surname);
    }

    // Negatiu: this va abans. Zero: iguals. Positiu: this va després.
    @Override
    public int compareTo(Person other) {
        int c = surname.compareTo(other.surname);
        if (c != 0) {
            return c;
        }
        return name.compareTo(other.name);
    }
}
