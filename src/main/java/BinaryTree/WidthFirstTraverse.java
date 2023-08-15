package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//宽度优先遍历（层序遍历）
public class WidthFirstTraverse {
    public WidthFirstTraverse(){}

    public void Width1(TNode head){
        if (head == null){
            return;
        }
        Queue<TNode> queue = new LinkedList<>();
        //键：节点 值：节点的层级
        HashMap<TNode, Integer> Map = new HashMap<>();
        Map.put(head,1);
        int curLevelNodes = 0;//当前层级的节点数
        int curLevel = 1;//当前节点层级
        int max = Integer.MIN_VALUE;//层级中最多节点的节点数
        queue.add(head);
        while(!queue.isEmpty()){
            TNode cur = queue.poll();
            int n = Map.get(cur);//获取当前层级

            if (n == curLevel){
                curLevelNodes++;

            } else {
                max = Math.max(max,curLevelNodes);
                curLevel++;
                curLevelNodes = 1;
            }

            if (cur.left!=null){
                Map.put(cur.left,curLevel+1);
                queue.add(cur.left);
            }
            if (cur.right!=null){
                Map.put(cur.right,curLevel+1);
                queue.add(cur.right);
            }
        }
        max = Math.max(max,curLevelNodes);
        System.out.println(max);
    }

    public void Width2(TNode head){
        if (head == null){
            return;
        }
        Queue<TNode> queue = new LinkedList<>();

        TNode curend = head;//当前层级的最后一个节点
        TNode nextend = null;//下一个层级的最后一个节点
        int curLevel = 1;//当前层级的节点数
        int max = Integer.MIN_VALUE;//层级中最多节点的节点数

        queue.add(head);
        while(!queue.isEmpty()){
            TNode cur = queue.poll();

            if (cur.left!=null){
                queue.add(cur.left);
                nextend = cur.left;

            }
            if (cur.right!=null){
                queue.add(cur.right);
                nextend = cur.right;
            }

            if (cur != curend){
                curLevel++;
            } else {
                max = Math.max(max,curLevel);
                curLevel = 1;
                curend = nextend;
            }
        }

        System.out.println(max);
    }
}
