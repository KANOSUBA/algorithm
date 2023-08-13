package LinkList;

import LinkList.Node;

import java.util.Scanner;

public class ListNode {
    Node first;
    Node cur;

    public Node getNode(){
        return first;
    }
    public ListNode(){}

    public void addList(int data){
        Node node = new Node(data);
    }
    public  void  createNodeList() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != -1){
            Node node = new Node(n);
            if (first == null){
                first = node;
                cur = first;
            }else {
                cur.next = node;
                cur = node;
            }
            n = sc.nextInt();
        }
    }

    public void display(Node node){
        Node flag ;
        flag = node;

        while(flag != null){
            System.out.print(flag.data+" ");
            flag =  flag.next;
        }
    }

    //反转链表
    public void reversalList(){
        Node prev = null;
        Node cur2 = first;
        while(cur2 != null){
            Node next = cur2.next;
            cur2.next = prev;
            prev = cur2;
            cur2 = next;
        }
        first = prev;
    }

}
