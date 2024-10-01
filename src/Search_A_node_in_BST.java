class Node{
    int data;
    Node left;
    Node right;

    Node(int d)
    {
        this.data = d;
        left = right = null;
    }
}

public class Search_A_node_in_BST {

   public static boolean search(Node root, int x) {

        // iterative traversal

        while(root!=null)
        {
            if(root.data==x)
            {
                return true;
            }

            else if(root.data<x)
            {
                root=root.right;
            }

            else{
                root=root.left;
            }
        }

        return false;
    }


    public static void main(String[] args) {

       Node root = new Node(2);
       root.right = new Node(81);
       root.right.left = new Node(42);
       root.right.right = new Node(87);
       root.right.right.right= new Node(90);
       root.right.left.right = new Node(66);
        root.right.left.right.left = new Node(66);

        int x = 87;

        boolean res = search(root, x);

        System.out.println(res);

    }
}