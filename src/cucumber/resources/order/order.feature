Feature: An order

  Scenario: Creating an order
    Given I have to create an order for "John"
    And it needs to be delivered in "Porto"
    And that order's worth is 50.0 Euros
    And it needs 6.0 cubic meters in order to be transported
    And I create said order
    When I retrieve that order's information
    Then it must be correct
