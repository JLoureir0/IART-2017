package deliverify.api.tree;

import java.util.ArrayList;

public class Node<T> {

  private T data;
  private Node<T> parent;
  private ArrayList<Node<T>> children;

  public Node(T data) {

    this.data = data;
    this.children = new ArrayList<Node<T>>();
  }

  public T getData() {

    return data;
  }

  public Node<T> getParent() {

    return parent;
  }

  public ArrayList<Node<T>> getChildren() {

    return children;
  }

  public Node<T> addChild(T childData) {

    Node<T> childNode = new Node<T>(childData);
    childNode.parent  = this;

    this.children.add(childNode);

    return childNode;
  }

}
