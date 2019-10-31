package com.dezikk.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        tree.root = arrayToTree(arr, tree.root, 0);
        System.out.println(Arrays.toString(
                treeToArray(new int[countNodes(tree.root)], tree.root, 0)));
        System.out.println(Arrays.toString(treeToArray(tree.root)));
    }

    public static Node arrayToTree(int[] arr, Node root, int position) {
        if (position < arr.length) {
            root = new Node(arr[position]);
            root.left = arrayToTree(arr, root.left, 2 * position + 1);
            root.right = arrayToTree(arr, root.right, 2 * position + 2);
        }
        return root;
    }

    public static int[] treeToArray(int[] arr, Node node, int position) {
        if (node != null) {
            arr[position] = node.data;
            arr = treeToArray(arr, node.left, 2 * position + 1);
            arr = treeToArray(arr, node.right, 2 * position + 2);
        }
        return arr;
    }

    public static int[] treeToArray(Node node) {
        int[] arr = new int[countNodes(node)];
        int i = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            arr[i++] = currNode.data;
            if (currNode.left != null)
                queue.add(currNode.left);
            if (currNode.right != null)
                queue.add(currNode.right);
        }
        return arr;
    }

    public static int countNodes(Node node, int count) {
        if (node != null) {
            count++;
            count = countNodes(node.left, count);
            count = countNodes(node.right, count);
        }
        return count;
    }

    public static int countNodes(Node node) {
        return countNodes(node, 0);
    }

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
