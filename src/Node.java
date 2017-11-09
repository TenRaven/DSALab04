public class Node {
  private Comparable value;
  private Node left, right, parent;
  public Node(Comparable value){
    this.value = value;
  }
  public Comparable getValue() {
    return value;
  }

  public void setValue(Comparable value) {
    this.value = value;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }
}
