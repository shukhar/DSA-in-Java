import java.util.Scanner;

public class BinaryTree {
//    Scanner sc = new Scanner(System.in);
    public BinaryTree(){}
    private static class Node {
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    private Node root;
    //insert elements

    public void populate(Scanner sc){
        System.out.println("Enter the Root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to insert in the left of :"+ node.value);
        boolean b = sc.nextBoolean();
        if(b){
            System.out.println("Enter the value left of: "+node.value);
            int n = sc.nextInt();
            node.left = new Node(n);
            populate(sc, node.left);
        }

        System.out.println("Do you want to insert in the right of :"+ node.value);
        boolean r = sc.nextBoolean();
//        sc.nextLine();
        if(r){
            System.out.println("Enter the value right of: "+node.value);
            int n = sc.nextInt();
            node.right = new Node(n);
            populate(sc, node.right);
        }
    }
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
