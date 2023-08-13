package LinkList;


import java.util.Stack;

public class JudgmentPalindrome {
    public JudgmentPalindrome(){}
    //利用栈结构
    public String judge1(Node head){
        Stack<Integer> stack=new Stack<>();
        Node node1 = head;
        Node node2 = head;
        int flag = 0;
        int i =0;

        while(node1 != null){
            stack.push(node1.data);
            i++;
            node1 =node1.next;
        }

        int[]  help = new int[i];
        int j = 0;

        while(node2 != null){
            help[j] = node2.data;
            j++;
            node2 = node2.next;
        }

        int z = 0;
        while(stack.isEmpty() == false){
            if (stack.pop() != help[z]){
                flag = 1;
                break;
            }
            z++;
        }

        if (flag ==0){
            return "该单链表是回文结构";
        } else {
            return "该单链表不是回文结构";
        }

    }


    //利用快慢指针
    public String judge2(Node head){
        //每次走一格
        Node p1 = head;
        //每次走二格
        Node p2 = head;
        Node node = head;

        int flag = 0;
        int n = 0;
        while(node != null){
            n++;
            node = node.next;
        }

        if (n% 2 == 1){
            while(p2.next!=null){
                p1 = p1.next;
                p2 = p2.next.next;
            }
            Node a = head;
            Node b = p1.next;
            Node prev = null;
            while(b!=null){
                Node next = b.next;
                b.next = prev;
                prev = b;
                b = next;
            }
            while(a != p1) {
                if (a.data != prev.data){
                    flag = 1;
                    break;
                }
                a = a.next;
                prev = prev.next;
            }
        } else {
            while(p2.next.next!=null){
                p1 = p1.next;
                p2 = p2.next.next;
            }
            Node a = head;
            Node b = p1.next;
            Node prev = null;
            while(b!=null){
                Node next = b.next;
                b.next = prev;
                prev = b;
                b = next;
            }
            while(a != p1) {
                if (a.data != prev.data){
                    flag = 1;
                    break;
                }
                a = a.next;
                prev = prev.next;
            }
            if (a.data != prev.data){
                flag = 1;
            }
        }

        if (flag == 0){
            return "该单链表是回文结构";
        } else {
            return "该单链表不是回文结构";
        }
    }
}
