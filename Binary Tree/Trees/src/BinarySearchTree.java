import java.util.Scanner;

public class BinarySearchTree {


    private class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value = value;
        }
    }

    private Node root;


//    Kunal's way
    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value,node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }
        return node;
    }

    public void populate(int [] nums){
        for(int i : nums){
            this.insert(i);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

//  MY method to insert the nodes in a search tree
//    public void insert(){
//        Scanner sc = new Scanner(System.in);
//        boolean b= true;
//        while(b){
//            System.out.println("Enter value:");
//            int  value = sc.nextInt();
//            insert(root,value,root);
//            System.out.println("Continue?");
//            b = sc.nextBoolean();
//        }
//
//    }
//    private void insert(Node node,int value,Node old){
//        if(node == null){
//            if(value<= old.value){
//                old.left = new Node(value);
//            }else{
//                old.right = new Node(value);
//            }
//            return;
//        }
//        if(value <= node.value){
//            if(node.left == null) old = node;
//            insert(node.left,value,old);
//
//        }
//        if(value >= node.value){
//            if(node.right == null) old = node;
//            insert(node.right, value,old);
//        }
//    }

    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,"\t");
        display(node.right, "\t");
    }
    public void prettydisplay(){
        prettydisplay(root,0);
    }

    private void prettydisplay(Node node, int level){
        if(node == null){
            return;
        }

        prettydisplay(node.right, level+1);
        if(level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+ node.value);
        }else{
            System.out.println(node.value);
        }
        prettydisplay(node.left,level+1);
    }
}
