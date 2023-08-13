package LinkList;

//将单向链表按某值划分成左边小，中间相等，右边大的形式
public class LinkedXiaohe {


    public LinkedXiaohe(){}

    public Node partition(Node node,int data){
        Node SH = null;
        Node ST = null;
        Node EH = null;
        Node ET = null;
        Node BH = null;
        Node BT = null;

        while(node != null){
            if (node.data<data){
                if (SH == null){
                    SH = node;
                    ST = SH;
                } else {
                    ST.next = node;
                    ST = node;
                }
            } else if (node.data==data) {
                if (EH == null){
                    EH = node;
                    ET = EH;
                } else {
                    ET.next = node;
                    ET = node;
                }
            } else {
                if (BH == null){
                    BH = node;
                    BT = BH;
                } else {
                    BT.next = node;
                    BT = node;
                }
            }
            node =node.next;
        }

        if (SH!=null && EH!=null && BH!= null ){
            ST.next = EH;
            ET.next = BH;
            BT.next = null;
            return SH;
        } else {
            return null;
        }

    }
}
