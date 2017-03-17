Feature: An order

  Background: Creating an order
    Given I have to create an order for "John"
    And it needs to be delivered in "Porto"
    And that order's worth is 50.0 Euros
    And it needs 6.0 cubic meters in order to be transported
    And I create said order

  Scenario: Retrieve the order's customer
    When I retrieve the order's customer
    Then it must be the right customer

  Scenario: Retrieve the order's delivery point
    When I retrieve the order's delivery point
    Then it must be the right delivery point

  Scenario: Retrieve the order's value
    When I retrieve the order's value
    Then it must be the right value

  Scenario: Retrieve the order's volume
    When I retrieve the order's volume
    Then it must be the right volume
