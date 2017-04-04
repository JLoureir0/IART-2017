Feature: A node

  Scenario: Creating a node
    Given I have to create a node in x=1 and y=1
    When I create the node
    Then all the information it contais must be correct

  Scenario: Adding a child
    Given I have to create a node in x=1 and y=1
    And that node has a child at x=2 and y=2
    When I create the node
    And I create the child of that node
    Then the node must have a child with the correct data
