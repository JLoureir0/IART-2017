package deliverify.steps.api.tree;

import cucumber.api.java.en.*;

import static org.junit.Assert.*;

import deliverify.api.tree.Node;

public class NodeSteps {

  private int x;
  private int y;

  private int cost;

  private Node node;

  @Given("^I have to create a node in x=(\\d+) and y=(\\d+)$")
  public void iHaveToCreateANodeInXAndY(int x, int y) throws Throwable {

    this.x = x;
    this.y = y;
  }

  @Given("^it has a cost if (\\d+)$")
  public void itHasACostIf(int cost) throws Throwable {

    this.cost = cost;
  }

  @When("^I create the node$")
  public void iCreateTheNode() throws Throwable {

    this.node = new Node(x, y);
    this.node.setCost(this.cost);
  }

  @Then("^all the information it contais must be correct$")
  public void allTheInformationItContaisMustBeCorrect() throws Throwable {

    assertEquals(this.x, this.node.getX());
    assertEquals(this.y, this.node.getY());
    assertEquals(this.cost, this.node.getCost());
  }

}
