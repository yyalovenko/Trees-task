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
        Node root = new Node(1);
        Node ten = new Node (10);
        Node twenty = new Node (20);
        Node thirtyOne = new Node(31);
        Node twentyTwo = new Node (22);
        Node three = new Node(3);
        Node seven = new Node (7);
        Node twentyFive = new Node (25);
        Node eleven = new Node (11);
        Node fourtyFive = new Node (45);
        Node six = new Node (6);
        Node five = new Node(5);

        root.setLeftChild(ten);
        root.setRightChild(twentyFive);
        ten.setLeftChild(twenty);
        ten.setRightChild(three);
        twenty.setLeftChild(thirtyOne);
        twenty.setRightChild(twentyTwo);
        three.setRightChild(seven);
        twentyFive.setLeftChild(eleven);
        twentyFive.setRightChild(fourtyFive);
        fourtyFive.setLeftChild(six);
        fourtyFive.setRightChild(five);

        return root;
    }

}
