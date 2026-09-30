package v2;

public class Sorter {

    public void sort(Sortable[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (items[j + 1].isBigger(items[j])) {
                    Sortable tmp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = tmp;
                }
            }
        }
    }
}