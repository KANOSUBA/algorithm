import LinkList.*;

public class test {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        listNode1.addList(1);
        listNode1.addList(2);
        listNode1.addList(3);
        listNode1.addList(4);
        listNode1.addList(5);
        listNode2.addList(11);
        listNode2.addList(12);
        listNode2.addList(13);
        listNode2.addList(14);
        Node node1 = listNode1.getNode();
        Node node2 = listNode2.getNode();

        Node cur = node2;
        while (cur.next!=null){
            cur = cur.next;
        }
        Node cur2 = node1;

        while (cur2.next!=null){
            cur2 = cur2.next;
        }
        //cur2.next = node1.next.next;
        cur.next = node1.next.next;


        listNode3.display(listNode1.getNode());
        System.out.println(" ");
        listNode3.display(listNode2.getNode());
        System.out.println(" ");

        IntersectList intersectList = new IntersectList();
        Node intersectNode = intersectList.getIntersectNode(listNode1.getNode(), listNode2.getNode());
        if (intersectNode == null){
            System.out.println("无相交");
        } else
        {
            System.out.println(intersectNode.getData());
        }

    }
}
