package LinkList;

public class Node {

    int data;
    public Node next = null;
    Node(){};
    Node(int data) {
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
