package v1;

public class Sorter {

    public void sort(Person[] people) {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (isGreater(people[j], people[j + 1])) {
                    Person tmp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = tmp;
                }
            }
        }
    }

    private boolean isGreater(Person a, Person b) {
        int c = a.getSurname().compareTo(b.getSurname());
        if (c != 0) {
            return c > 0;
        }
        return a.getName().compareTo(b.getName()) > 0;
    }
}
