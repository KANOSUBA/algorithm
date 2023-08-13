package LinkList;

import com.sun.org.apache.bcel.internal.generic.PUSH;

//两个单链表相交的一些列问题
//给定两个可能有环也可能无环的单链表，头节点head1和head2。
//请实现一个函数，如果两个链表相交，请返回相交的第一个节点。如果不相交，返回NULL
public class IntersectList {

    public IntersectList(){}
    public Node getIntersectNode(Node head1,Node head2){
        if (head1 ==null || head2==null){
            return null;
        }
        Node node1 = head1;
        Node node2 = head2;
        Node loop1 = isLoopList(node1);
        Node loop2 = isLoopList(node2);

        if (loop1==null && loop2==null){
            return noLoop(head1, head2);
        } else if (loop1 !=null && loop2 != null){
            return hasLoop(head1,head2,loop1,loop2);
        } else {
            return null;
        }
    }

    //判断链表是有环，有环则返回入环节点，没有则返回null
    public Node isLoopList(Node head){
        if (head == null || head.next == null || head.next.next==null){
            return  null;
        }
        Node fast = head;
        fast = fast.next.next;
        Node slow = head;
        slow = slow.next;
        while(fast != slow){
            if (fast.next == null || fast.next.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    //如果两个链表都无环，返回第一个相交节点，如果不相交，返回null
    public Node noLoop(Node head1,Node head2){
        if (head1 == null || head2 == null){
            return null;
        }
        Node cur1 = head1;
        Node cur2 = head2;
        int n = 0;
        while(cur1.next != null){
            n++;
            cur1 = cur1.next;
        }
        while(cur2.next != null){
            n--;
            cur2 = cur2.next;
        }

        if (cur1 != cur2){
            return null;
        }
        cur1 = n > 0 ? head1 : head2;//谁长，谁的头变成cur1

        cur2 = cur1 == head1 ? head2 : head1;//谁短，谁的头变成cur2

        n = Math.abs(n);

        while(n != 0){
            cur1 = cur1.next;
            n--;
        }

        while(cur1 != cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }

    public Node hasLoop(Node head1,Node head2,Node loop1,Node loop2){
        Node cur1 = null;
        Node cur2 = null;
        if (loop1 == loop2){
            cur1 = head1;
            cur2 = head2;
            int n = 0;
            while(cur1!= loop1){
                n++;
                cur1 = cur1.next;
            }
            while(cur2!= loop2){
                n--;
                cur2 = cur2.next;
            }

            cur1 = n > 0 ? head1 : head2;

            cur2 = cur1 == head1 ? head2 : head1;

            n = Math.abs(n);
            while(n != 0){
                cur1 = cur1.next;
                n--;
            }
            while (cur1!=cur2){
                cur1= cur1.next;
                cur2= cur2.next;
            }
            return cur1;
        } else {
            cur1 = loop1.next;
            while(cur1 != loop1){
                if (cur1 == loop2){
                    return loop1;
                }
                cur1 = cur1.next;
            }
            return null;
        }
    }
}
