import BinaryTree.*;

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

        System.out.println(" ");

        WidthFirstTraverse widthFirstTraverse = new WidthFirstTraverse();
        System.out.println("以下是二叉树的宽度");
        widthFirstTraverse.Width1(tree);
        widthFirstTraverse.Width2(tree);
    }
}
