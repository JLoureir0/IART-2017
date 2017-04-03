Feature: A node

  Scenario: Creating a node
    Given I have to create a node in x=1 and y=1
    And it has a cost if 50
    When I create the node
    Then all the information it contais must be correct
