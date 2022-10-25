Feature: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
@newW
Scenario Outline: Login page
Given the user is on the login page
When the user enters username "<username>"
And the user enters password "<password>"
Then the user should see dashboard
Examples:
|username         | password  |
|user66           |UserUser123|
|storemanager66   |UserUser123|
|salesmanager66   |UserUser123|
