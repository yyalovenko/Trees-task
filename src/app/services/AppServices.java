package app.services;

import app.entity.Node;

public class AppServices {

    public static void printInOrder(Node root) {
        if(root == null) {
            return;
        }

        printInOrder(root.getLeftChild());
        System.out.print(root.getValue() + " ");
        printInOrder(root.getRightChild());

    }

    public static void printPreOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");
        printPreOrder(root.getLeftChild());
        printPreOrder(root.getRightChild());
    }

    public static void printPostOrder(Node root) {
        if(root == null) {
            return;
        }

        printPostOrder(root.getLeftChild());
        printPostOrder(root.getRightChild());
        System.out.print(root.getValue() + " ");
    }

    public static Node buildTree() {

        int[] valuesArr = {1,10,20,31,22,3,7,25,11,45,6,5};
        Node[] nodesArr = new Node[12];

        for(int i = 0; i < valuesArr.length; i++) {
            nodesArr[i] = new Node(valuesArr[i]);
        }

        nodesArr[0].setLeftChild(nodesArr[1]);
        nodesArr[0].setRightChild(nodesArr[7]);
        nodesArr[1].setLeftChild(nodesArr[2]);
        nodesArr[1].setRightChild(nodesArr[5]);
        nodesArr[2].setLeftChild(nodesArr[3]);
        nodesArr[2].setRightChild(nodesArr[4]);
        nodesArr[5].setRightChild(nodesArr[6]);
        nodesArr[7].setLeftChild(nodesArr[8]);
        nodesArr[7].setRightChild(nodesArr[9]);
        nodesArr[9].setLeftChild(nodesArr[10]);
        nodesArr[9].setRightChild(nodesArr[11]);

        return nodesArr[0];
    }

}
