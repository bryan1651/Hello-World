import java.util.*;
public class IntegerSet implements Set {

    private int[] array;
    private int size;
    Random ran =  new Random();


    public IntegerSet(){
        this.array = new int[10];
        this.size = (array.length - 1);

    }
    public IntegerSet(int[] arr){
        this.array = new int[arr.length];
        this.size = (arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
    }

    public IntegerSet(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    public boolean isItFull(){
        if(size == array.length){
            return true;
        }
        return false;
    }
    public void expand(){
            int[] news = new int[array.length*2];
            for(int i = 0; i < array.length; i++){
                news[i] = array[i];
            }
            array = news;
    }

    public boolean add(int a) {

        for(int i = 0; i < size; i++){
            if(array[i] == a){
                return false;
            }
        }
        if(isItFull()){
            expand();
        }
        array[size] = a;
        size++;
        return true;

    }

    public void addAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            add(a[i]);
        }
    }

    public void removeRandom() {
        int random = ran.nextInt(size);
        remove(array[random]);
    }

    public void remove(int a) {
        int[] news = new int[array.length - 1];
        int contains = 0;
        int index = 1;
        for(int i = 0; i < size; i++){
            if(array[i] == a){
                contains++;
                index = i;
                break;
            }
        }

        if(contains > 0){
            for(int i = 0; i < index; i++){
                news[i] = array[i];
            }
            for(int i = index + 1; i < array.length; i++){
                news[i - 1] = array[i];
            }
            array = news;
            size--;
        }

    }

    public Set union(Set a) {
        Set news = new IntegerSet(size + a.size());
        news.addAll(a.toArray());
        news.addAll(this.toArray());
        return news;


    }

    public boolean contains(int a) {
        for(int i = 0; i < size; i ++){
            if(array[i] == a)
            {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Set a) {
        if(array.length == a.size()){
            for(int i = 0; i < size; i++){
                if(!a.contains(array[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String k = "[";

        for (int i = 0; i < size; i++) {
            k += array[i];
            if (i < size - 1) {
                k += ", ";
            }
        }

        return k + "]";
    }

    public int[] toArray(){
        int[] news = new int[size];
        for(int i = 0; i < size; i++){
            news[i] = array[i];
        }
        return news;
    }

}
