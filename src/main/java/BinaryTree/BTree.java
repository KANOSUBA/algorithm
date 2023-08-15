package BinaryTree;

import java.util.Scanner;

public class BTree {
    public BTree(){
    }
    public TNode createTree(){
        TNode A=new TNode(1);
        TNode B=new TNode(2);
        TNode C=new TNode(3);
        TNode D=new TNode(4);
        TNode E=new TNode(5);
        TNode F=new TNode(6);
        TNode G=new TNode(7);
        TNode H=new TNode(8);
        A.left=B;
        A.right=C;
        C.left=F;
        B.left=D;
        B.right=E;
        C.right=G;
        D.left = H;
        return A;
    }
}
