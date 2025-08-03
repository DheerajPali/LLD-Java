package concurency.TreeSizeCalculator;

import javax.swing.tree.TreeNode;

public class TreeSizeCalculator {

    public static void main(String[] args) {

//        Node root = new Node(5);
//        root.left = new Node(4);
//        root.right = new Node(3);
//        root.left.left = new Node(5);
//        System.out.println(sizeCalculator(root));
    }

    public static int sizeCalculator(Node root){
        if(root == null) return 0;
        return 1 + sizeCalculator(root.left) + sizeCalculator(root.right);
    }



}
