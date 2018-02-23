public class ListTest {
    public static void main(String[] args) {
        int[] theThing = {10,9,8,7,6,5,4,3,2,1};

        List thing = new List(theThing);

        thing.isEmpty();

        System.out.println(thing);

        thing.add(4,10);

        System.out.println(thing);

        thing.remove(4);

        System.out.println(thing);

        thing.removeAll();

        System.out.println(thing);



    }
}