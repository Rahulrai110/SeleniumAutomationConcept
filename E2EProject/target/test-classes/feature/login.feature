Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to the "http://qaclickacademy.com/" site
And click on Login link in homepage to land on Secure signIn Page
When User enters <username> and <password> and login
Then verify that user is successfully logged in
And close browsers

Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|123456		|


