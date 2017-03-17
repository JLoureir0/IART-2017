package deliverify.steps.order;

import cucumber.api.java.en.*;

import static org.junit.Assert.*;

import deliverify.order.Order;

public class OrderSteps {

  private Order order;
  private String orderCustomer;
  private String orderDeliveryPoint;
  private float orderValue;
  private float orderVolume;

  private String retrievedOrderCustomer;
  private String retrievedOrderDeliveryPoint;
  private float retrievedOrderValue;
  private float retrievedOrderVolume;

  public static final float ADMISSIBLE_ERROR = 0.01f;

  @Given("^I have to create an order for \"([^\"]*)\"$")
  public void iHaveToCreateAnOrderFor(String orderCustomer) throws Throwable {
    this.orderCustomer = orderCustomer;
  }

  @Given("^it needs to be delivered in \"([^\"]*)\"$")
  public void itNeedsToBeDeliveredIn(String orderDeliveryPoint) throws Throwable {
    this.orderDeliveryPoint = orderDeliveryPoint;
  }

  @Given("^that order's worth is (\\d*\\.?\\d+) Euros$")
  public void thatOrderSWorthIsEuros(float orderValue) throws Throwable {
    this.orderValue = orderValue;
  }

  @Given("^it needs (\\d*\\.?\\d+) cubic meters in order to be transported$")
  public void itNeedsCubicMetersInOrderToBeTransported(float orderVolume) throws Throwable {
    this.orderVolume = orderVolume;
  }

  @Given("^I create said order$")
  public void iCreateSaidOrder() throws Throwable {
    order = new Order(orderCustomer, orderDeliveryPoint, orderValue, orderVolume);
  }

  @When("^I retrieve the order's customer$")
  public void iRetrieveTheOrderSCustomer() throws Throwable {
    retrievedOrderCustomer = order.getCustomer();
  }

  @Then("^it must be the right customer$")
  public void itMustBeTheRightCustomer() throws Throwable {
    assertEquals(retrievedOrderCustomer, orderCustomer);
  }

  @When("^I retrieve the order's delivery point$")
  public void iRetrieveTheOrderSDeliveryPoint() throws Throwable {
    retrievedOrderDeliveryPoint = order.getDeliveryPoint();
  }

  @Then("^it must be the right delivery point$")
  public void itMustBeTheRightDeliveryPoint() throws Throwable {
    assertEquals(retrievedOrderDeliveryPoint, orderDeliveryPoint);
  }

  @When("^I retrieve the order's value$")
  public void iRetrieveTheOrderSValue() throws Throwable {
    retrievedOrderValue = order.getValue();
  }

  @Then("^it must be the right value$")
  public void itMustBeTheRightValue() throws Throwable {
    assertEquals(retrievedOrderValue, orderValue, ADMISSIBLE_ERROR);
  }

  @When("^I retrieve the order's volume$")
  public void iRetrieveTheOrderSVolume() throws Throwable {
    retrievedOrderVolume = order.getVolume();
  }

  @Then("^it must be the right volume$")
  public void itMustBeTheRightVolume() throws Throwable {
    assertEquals(retrievedOrderVolume, orderVolume, ADMISSIBLE_ERROR);
  }

}
