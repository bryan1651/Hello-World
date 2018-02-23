public class List {
    private int[] arr;
    private int numberOfElements;

    public List(){
        this.arr = new int[10];
        numberOfElements = arr.length -1;
    }

    public List(int[] arr){
        this.arr = new int[arr.length];
        this.numberOfElements = (this.arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    public List(int capacity) {
        this.arr = new int[capacity];
        this.numberOfElements = 0;
    }

    public boolean isItFull(){
        if(numberOfElements == arr.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(numberOfElements == 0){
            return true;
        }
        return false;
    }

    public int elements(Object[] arr){
        return numberOfElements;
    }

    public void add(int index, int thing){
        if(isItFull()){
            throw new IndexOutOfBoundsException();
        }
        else{
            for(int i = numberOfElements; i < index; i-- ){
                arr[i] = arr[i -1];
            }
            arr[index] = thing;
        }
    }

    public void remove(int index){
        if(index > arr.length -1){
            throw new IndexOutOfBoundsException();
        }
        else{
            for(int i = index; i < numberOfElements -2; i++){
                arr[i] = arr[i+1];
            }
            arr[numberOfElements] = 0;
            numberOfElements--;
        }
    }

    public void removeAll(){
        if(numberOfElements == 0){
            throw new IndexOutOfBoundsException();
        }
        else {
            int[] newer = new int[arr.length];
            arr = newer;
        }
    }

    public String toString() {
        String k = "[";

        for (int i = 0; i < arr.length; i++) {
            k += arr[i];
            if (i < arr.length - 1) {
                k += ", ";
            }
        }

        return k + "]";
    }


}