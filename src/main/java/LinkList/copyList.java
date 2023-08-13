package LinkList;

import java.util.HashMap;

public class copyList {
    public copyList(){}


    //利用哈希表
    public randNode copy1(randNode head){
        HashMap<randNode, randNode> copyMap = new HashMap<>();
        randNode node = head;
        while(node!=null){
            copyMap.put(node,new randNode(node.data));
            node = node.next;
        }
        node = head;
        while(node!=null){
            copyMap.get(node).next = copyMap.get(node.next);
            copyMap.get(node).rand = copyMap.get(node.rand);
            node = node.next;
        }
        return copyMap.get(head);
    }

    //1->1'->2->2'->3->3'
    public randNode copy2(randNode head){
        if (head ==null){
            return null;
        }
        randNode node = head;
        randNode next;
        while(node!=null){
            next = node.next;
            node.next = new randNode(node.data);
            node.next.next = next;
            node = next;
        }
        node = head;
        randNode curCopy;
        while(node!=null){
            next = node.next.next;
            curCopy = node.next;
            curCopy.rand = node.rand!=null ? node.rand.next : null;
            node = next;
        }
        randNode res = head.next;
        node = head;
        while(node!=null){
            next = node.next.next;
            curCopy = node.next;
            node.next = next;
            curCopy.next = next != null? next.next : null;
            node = next;
        }
        return res;
    }
}
