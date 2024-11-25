@InterviewQuestions
Feature: Interview questions for bibit

  @Web
  Scenario: Open product detail Reksadana Pasar Uang
    Given user is in bibit website
    And user is in logged in state
    When user open "explore" tab
    And user click on "Reksa Dana" menu
    And user open product detail "Reksadana Pasar Uang"
    Then user will see list of products for "Reksadana Pasar Uang"

  @Android
  Scenario: Buy and sort products
    Given user is in app homepage
    When user login
    Then user is in app homepage

    When user buy product "Sauce Labs Backpack" with quantity 2 and color "Blue"
    Then user successfully buy product

    When user sort products by "Name - Descending"
    Then user successfully sort products by "Name - Descending"

    When user sort products by "Price - Ascending"
    Then user successfully sort products by "Price - Ascending"

  @API
  Scenario: Create a New Post
    Given user hit the endpoint "https://jsonplaceholder.typicode.com/posts"