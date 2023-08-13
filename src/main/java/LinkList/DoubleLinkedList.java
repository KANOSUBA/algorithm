package LinkList;
//双向链表
public class DoubleLinkedList {
    DoubleList head ;
    DoubleList current;

    //双向链表的增加
    public void add(int data){
        DoubleList node = new DoubleList(data);
        if (head == null){
            head = node;
            head.pre =null;
            head.next = null;
            current = head;
        } else {
            current.next = node;
            node.pre = current;
            current =node;
        }
    }

    //双向链表的删除，删除所有值为data的元素
    public void del(int data){
        if (head == null){
            System.out.println("双向链表为空，无法进行删除操作");
        }else {
            DoubleList node = head;
            while(true){

                //首节点被删除
                if (node.data == data){
                    //如果只有一个节点
                    if (node.next == null){
                        node = null;
                        head = null;
                        System.out.println("删除所有的"+data+"成功");
                        return;
                    } else {
                        node = node.next;
                        node.pre.next = null;
                        node.pre = null;
                        head = node;

                    }
                } else {
                    while(node.next!=null){
                        if (node.data ==data){
                            node.pre.next = node.next;
                            node.next.pre = node.pre;
                            DoubleList tempNode = node.pre;
                            node.pre = null;
                            node.next =null;
                            node = tempNode;
                        }
                        node = node.next;
                    }
                    //末节点删除可能
                    if (node.data ==data){
                        node.pre.next = null;
                        node.pre = null;
                    }
                    System.out.println("删除所有的"+data+"成功");
                    return;
                }
            }
        }

    }

    //遍历双向链表
    public void traverse() {
        if (head == null) {
            System.out.println("双向链表为空");
        } else {
            DoubleList node = head;
            while(node !=null){
                System.out.print(node.data+" ");
                node = node.next;
            }

        }
    }

    //双向链表插入操作，在所有值为value的后面插入一个数insert
    public void insert(int value,int insert){
        if (head == null){
            System.out.println("双向链表为空，无法插入");
        } else {
            DoubleList node = head;
            while(node.next != null){
                if (node.data == value){
                    DoubleList insertNode = new DoubleList(insert);
                    node.next.pre = insertNode;
                    insertNode.next = node.next;
                    node.next = insertNode;
                    insertNode.pre = node;
                }
                node = node.next;
            }
            //最后一个节点后插入
            if (node.data == value){
                DoubleList insertNode = new DoubleList(insert);
                node.next = insertNode;
                insertNode.pre = node;
            }
        }
    }

    //反转双向链表
    public void reversalDouble(){
        DoubleList prev = null;
        DoubleList node = head;
        while(node != null){
            DoubleList next = node.next;
            node.next = prev;
            node.pre = next;
            prev = node;
            node = next;
        }
        head = prev;
    }
}
