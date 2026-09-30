package v2;

// Qualsevol classe que implementi aquesta interfície es pot ordenar amb Sorter
public interface Sortable {
    // true si aquest objecte va després de "other" en l'ordre
    boolean isGreaterThan(Sortable other);
}
