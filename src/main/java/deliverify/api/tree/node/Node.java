package deliverify.api.tree;


public class Node {

  private int x;
  private int y;

  private int cost;

  public Node(int x, int y) {

    this.x = x;
    this.y = y;
  }

  public int getX() {

    return x;
  }

  public int getY() {

    return y;
  }

  public void setCost(int cost) {

    this.cost = cost;
  }

  public int getCost() {

    return cost;
  }

}
