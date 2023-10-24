class Node {
    int item;
    Node left , Right;

  public Node ( int key ){
      item = key;
      left = Right = null;
  }

}
class Tree {
    Node root;
    Tree(){
        root = null;
    }
    void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.println(node.item + " ->");
        inOrder(node.Right);

    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left= new Node(5);
        tree.root.Right = new Node(12);
        tree.root.left.left = new Node(5);
        tree.root.left.Right = new Node(6);
        System.out.println("Inorder tree traversal");
        tree.inOrder(tree.root);
    }
}
