package com.riigsoft.tree;

public class Tree {
    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }


        @Override
        public String toString() {
            return "Node="+ value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);


        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }


    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.left;
            else if (value > current.value)
                current = current.right;
            else
                return true;
        }
        return false;
    }

    public void traversalPreOrder() {
        traversalPreOrder(root);
    }

    private void traversalPreOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
    }

    public void traversalInOrder() {
        traversalInOrder(root);
    }

    private void traversalInOrder(Node root) {
        if (root == null)
            return;
        traversalInOrder(root.left);
        System.out.println(root.value);
        traversalInOrder(root.right);
    }

    public void traversalPostOrder() {
        traversalPostOrder(root);
    }

    private void traversalPostOrder(Node root) {
        if (root == null)
            return;
        traversalPostOrder(root.left);
        traversalPostOrder(root.right);
        System.out.println(root.value);
    }
}
