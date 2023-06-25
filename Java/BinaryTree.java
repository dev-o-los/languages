package Java;

public class BinaryTree {
  Node1 root;

  public void addNode(int data) {
    root = addNodeRecursive(root, data);
  }

  private Node1 addNodeRecursive(Node1 current, int data) {
    if (current == null) {
      return new Node1(data);
    }

    if (data < current.data) {
      current.left = addNodeRecursive(current.left, data);
    } else if (data > current.data) {
      current.right = addNodeRecursive(current.right, data);
    } else {
      // value already exists
      return current;
    }

    return current;
  }

  public void traverseInOrder() {
    traverseInOrderRecursive(root);
  }

  private void traverseInOrderRecursive(Node1 current) {
    if (current != null) {
      traverseInOrderRecursive(current.left);
      System.out.println(current.data + " ");
      traverseInOrderRecursive(current.right);
    }
  }

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    bt.addNode(6);
    bt.addNode(4);
    bt.addNode(8);
    bt.addNode(3);
    bt.addNode(5);
    bt.addNode(7);
    bt.addNode(9);

    bt.traverseInOrder(); // output: 3 4 5 6 7 8 9
  }
}

class Node1 {
  int data;
  Node1 left;
  Node1 right;

  Node1(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
