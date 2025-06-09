import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(sc);
////        tree.display();
//        tree.prettydisplay();

        BinarySearchTree trees = new BinarySearchTree();
        int[] nums = {15,6,20,10};
        trees.populate(nums);
        trees.prettydisplay();
    }
}