package com.algorithm.datastructure.binarytree;

public class BinarySearchTree {

    class Node {
        int key;
        String value;
        Node left, right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public Node min(){
            if (left == null){
                return this;
            } else {
                return left.min();
            }
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node findMin(Node node) {
        return node.min();
    }

    public int findMinKey() {
        return findMin(root).key;
    }

    public String find(int key){
        Node node = find(root, key);
        return node == null ? null : node.value;
    }

    private Node find(Node node, int key){
        if (node == null || node.key == key){
            return node;
        } else if (key < node.key){
            return find(node.left, key);
        } else if (key > node.key) {
            return  find(node.right, key);
        }
        return null;
    }

    public void insert(int key, String value){
        root = insertItem(root, key, value);
    }

    private Node insertItem(Node node, int key, String value) {
        Node newNode = new Node(key, value);

        if (node == null){
            node = newNode;
            return node;
        }

        if (key < node.key){
            node.left = insertItem(node.left, key, value);
        } else {
            node.right = insertItem(node.right, key, value);
        }
        return node;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node node, int key) {
        if (node == null){
            return null;
        } else if (key < node.key){
            node.left = delete(node.left, key);
        } else if (key > node.key){
            node.right = delete(node.right, key);
        } else {
            // Case 1: No Child
            if (node.left == null && node.right == null){
                node = null;
            }
            // Case 2: One Child
            else if (node.left == null){
                node = node.right;
            } else if (node.right == null){
                node = node.left;
            }
            // Case 3: Two children
            else {
                //Find the minimum node on the right (could also max the left...)
                Node minRight = findMin(node.right);

                // Duplicate it by copying its values here
                node.key = minRight.key;
                node.value = minRight.value;

                //Now go ahead and delete the node we just duplicated
                node.right = delete(node.right, node.key);
            }
        }
        return node;
    }

    public void prettyPrint() {
        // Hard coded print out of binary tree depth = 3

        int rootLeftKey = root.left == null ? 0 : root.left.key;
        int rootRightKey = root.right == null ? 0 : root.right.key;

        int rootLeftLeftKey = 0;
        int rootLeftRightKey = 0;

        if (root.left != null) {
            rootLeftLeftKey = root.left.left == null ? 0 : root.left.left.key;
            rootLeftRightKey = root.left.right == null ? 0 : root.left.right.key;
        }

        int rootRightLeftKey = 0;
        int rootRightRightKey = 0;

        if (root.right != null) {
            rootRightLeftKey = root.right.left == null ? 0 : root.right.left.key;
            rootRightRightKey = root.right.right == null ? 0 : root.right.right.key;
        }

        System.out.println("     " + root.key);
        System.out.println("   /  \\");
        System.out.println("  " + rootLeftKey + "    " + rootRightKey);
        System.out.println(" / \\  / \\");
        System.out.println(rootLeftLeftKey + "  " + rootLeftRightKey + " " + rootRightLeftKey + "   " + rootRightRightKey);
    }

    public void  printInOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node){
        if (node != null){
            inOrderTraversal(node.left);
            System.out.println(node.key);
            inOrderTraversal(node.right);
        }
    }

    public void  printPreOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node){
        if (node != null){
            System.out.println(node.key);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void  printPostOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node node){
        if (node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.key);
        }
    }
}
