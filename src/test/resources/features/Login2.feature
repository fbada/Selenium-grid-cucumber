Feature: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

@new
  Scenario Outline: Login page
    Given user is on the library login page
    When user enters username "<username>"
    And user enters password "<password>"
    Then user should see dashboard
    Examples:
      |username  | password|
      |librarian | password|
      |student   | password|
      |admin     | password|