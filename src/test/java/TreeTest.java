import BinaryTree.BTree;
import BinaryTree.NonRecursiveTraversal;
import BinaryTree.RecursionTraversal;
import BinaryTree.TNode;

public class TreeTest {
    public static void main(String[] args) {

        BTree bTree = new BTree();
        TNode tree = bTree.createTree();

        RecursionTraversal recursionTraversal = new RecursionTraversal();

        System.out.println("以下是递归遍历");
        recursionTraversal.PreOrderTraversal(tree);
        System.out.println(" ");
        recursionTraversal.InOrderTraversal(tree);
        System.out.println(" ");
        recursionTraversal.PostOrderTraversal(tree);

        System.out.println(" ");

        NonRecursiveTraversal nonRecursiveTraversal = new NonRecursiveTraversal();
        System.out.println("以下是非递归遍历");
        nonRecursiveTraversal.PreOrderTraversal(tree);
        System.out.println(" ");
        nonRecursiveTraversal.InOrderTraversal(tree);
        System.out.println(" ");
        nonRecursiveTraversal.PostOrderTraversal(tree);
    }
}
