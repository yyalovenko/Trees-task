package app.entity;

public class Node {

    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void setLeftChild(Node node) {
        this.leftChild = node;
    }

    public void setRightChild(Node node) {
        this.rightChild = node;
    }
    public int getValue() {
        return this.value;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

}
