package BinaryTree;
//递归遍历二叉树，前序，中序，后序
public class RecursionTraversal {
    public void PreOrderTraversal(TNode head){
        if (head == null){
            return;
        }
        System.out.print(head.data+" ");
        PreOrderTraversal(head.left);
        PreOrderTraversal(head.right);
    }

    public void InOrderTraversal(TNode head){
        if (head == null){
            return;
        }

        InOrderTraversal(head.left);
        System.out.print(head.data+" ");

        InOrderTraversal(head.right);
    }

    public void PostOrderTraversal(TNode head){
        if (head == null){
            return;
        }

        PostOrderTraversal(head.left);


        PostOrderTraversal(head.right);
        System.out.print(head.data+" ");
    }
}
