package deliverify.steps.api.tree.node;

import java.util.ArrayList;

import cucumber.api.java.en.*;

import static org.junit.Assert.*;

import deliverify.api.tree.node.Node;

public class NodeSteps {

  private int x;
  private int y;

  private Node<int[]> node;

  private int childX;
  private int childY;

  private Node<int[]> childNode;

  @Given("^I have to create a node in x=(\\d+) and y=(\\d+)$")
  public void iHaveToCreateANodeInXAndY(int x, int y) throws Throwable {

    this.x = x;
    this.y = y;
  }

  @When("^I create the node$")
  public void iCreateTheNode() throws Throwable {

    this.node = new Node<int[]>(new int[] {this.x, this.y});
  }

  @Then("^all the information it contais must be correct$")
  public void allTheInformationItContaisMustBeCorrect() throws Throwable {

    int x = this.node.getData()[0];
    int y = this.node.getData()[1];

    assertEquals(this.x, x);
    assertEquals(this.y, y);
  }

  @Given("^that node has a child at x=(\\d+) and y=(\\d+)$")
  public void thatNodeHasAChildAtXAndY(int childX, int childY) throws Throwable {

    this.childX = childX;
    this.childY = childY;
  }

  @When("^I create the child of that node$")
  public void iCreateTheChildOfThatNode() throws Throwable {

    this.childNode = this.node.addChild(new int[] {this.childX, this.childY});
  }

  @Then("^the node must have a child with the correct data$")
  public void theNodeMustHaveAChildWithTheCorrectData() throws Throwable {

    ArrayList<Node<int[]>> children = this.node.getChildren();

    assertEquals(1, children.size());

    assertEquals(this.node, this.childNode.getParent());

    int childX = children.get(0).getData()[0];
    int childY = children.get(0).getData()[1];

    assertEquals(this.childX, childX);
    assertEquals(this.childY, childY);
  }

}
