import java.util.*;

class Node1{
    int data;
    Node1 left;
    Node1 right;

    Node1(int d)
    {
        this.data = d;
        left = right = null;
    }
}


public class Insert_A_node_in_BST {

  public static Node1 insert(Node1 root, int Key) {

        // Recursive

        if(root==null)
        {
            return new Node1(Key);
        }

        else if(root.data==Key){
            return root;
        }

        else if(root.data<Key)
        {
            root.right = insert(root.right, Key);
        }

        else{
            root.left = insert(root.left, Key);
        }

        return root;

    }

    public static void Inorder(Node1 head, ArrayList<Integer> list)
    {
        if(head==null)
        {
            return;
        }

        Inorder(head.left, list);
        list.add(head.data);
        Inorder(head.right, list);

    }

    public static void main(String[] args) {

      Node1 root = new Node1(2);
      root.left = new Node1(1);
      root.right = new Node1(3);
      root.right.right = new Node1(6);

      int key = 4;

      Node1 res = insert(root, key);

      Node1 curr = res;

      // printing the Inorder traversal (left-> root -> right)

        ArrayList<Integer> list = new ArrayList<Integer>();

        Inorder(curr, list);

        System.out.println(list);

    }
}
