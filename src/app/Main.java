package app;

import app.entity.Node;

import static app.services.AppServices.*;

public class Main {

    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("---Printing tree in PreOrder ---");
        printPreOrder(root);
        System.out.println("\n\n ---Printing tree in InOrder ---");
        printInOrder(root);
        System.out.println("\n\n ---Printing tree in PostOrder ---");
        printPostOrder(root);
    }

}
