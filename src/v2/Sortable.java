package v2;

public interface Sortable {
    // true if "other" (second object) is bigger than this (first object) in sort order
    boolean isBigger(Sortable other);
}
