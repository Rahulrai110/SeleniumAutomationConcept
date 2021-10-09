Feature: Application login

@Smoke
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username and password
Then Home page is populated
And Cards are display

@Regresion
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "Rahul" and password "12345"
Then Home page is populated
And Cards are display