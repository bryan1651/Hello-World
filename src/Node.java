import org.omg.CORBA.OBJECT_NOT_EXIST;

public class Node {
    private Object value;
    private Node next;

    public Node(Object a){
        value = a;
        next = null;
    }
    public Node getNext() {
        return next;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object a){
        value = a;
    }

    public void setNext(Node a){
        next = a;
    }

}
