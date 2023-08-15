package BinaryTree;

import java.util.Stack;

//非递归遍历二叉树，前序，中序，后序
public class NonRecursiveTraversal {
    //前序
    //1.从
    //2.打印cur
    //3.先右再左压入栈中(如果有)
    //4.重复
    public void PreOrderTraversal(TNode head){
        Stack<TNode> stack = new Stack<>();
        stack.push(head);
        while(!stack.isEmpty()){
            TNode cur = stack.pop();
            System.out.print(cur.data + " ");
            if (cur.right != null){
                stack.push(cur.right);
            }
            if (cur.left != null){
                stack.push(cur.left);
            }
        }
    }
    //后序
    //1.从栈中弹出一个节点cur
    //2.cur放入收集栈
    //3.先左再右
    //4.重复
    public void PostOrderTraversal(TNode head){
        Stack<TNode> stack1 = new Stack<>();
        Stack<TNode> stack2 = new Stack<>(); //收集栈
        stack1.push(head);
        while(!stack1.isEmpty()){
            TNode cur1 = stack1.pop();
            stack2.push(cur1);
            if (cur1.left != null){
                stack1.push(cur1.left);
            }
            if (cur1.right != null){
                stack1.push(cur1.right);
            }
        }
        while(!stack2.isEmpty()){
            TNode cur2 = stack2.pop();
            System.out.print(cur2.data + " ");
        }
    }

    //中序
    //1.一直将左孩子进栈，直到出现null
    //2.弹出栈中的一个节点，并且打印该节点
    //3.判断该节点是否有右孩子，有右孩子则将右孩子进栈
    //4.重复
    public void InOrderTraversal(TNode head){
        Stack<TNode> stack = new Stack<>();
        TNode cur = head;
        stack.push(head);
        while(!stack.isEmpty()){
            if (cur.left!=null){
                stack.push(cur.left);
                cur = cur.left;
            } else {
                cur = stack.pop();
                System.out.print(cur.data + " ");
                if (cur.right != null){
                    stack.push(cur.right);
                    cur=cur.right;
                }
            }
        }
    }
}
