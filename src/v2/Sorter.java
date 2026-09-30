package v2;

public class Sorter {

    // Ja no depèn de Person: accepta qualsevol array de Sortable
    public void sort(Sortable[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (items[j].isGreaterThan(items[j + 1])) {
                    Sortable tmp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = tmp;
                }
            }
        }
    }
}
