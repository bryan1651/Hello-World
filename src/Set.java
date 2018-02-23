public interface Set {

    public boolean  add(int a);
    public void addAll(int[] a);
    public void removeRandom();
    public void remove(int a);
    public Set union(Set a);
    public boolean contains(int a );
    public boolean equals(Set a);
    public boolean isEmpty();
    public int size();
    public String toString();
    public int[] toArray();
}
