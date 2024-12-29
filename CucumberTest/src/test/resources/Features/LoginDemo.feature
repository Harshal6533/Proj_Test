Feature: Login

Scenario: Successful login with valid creds

Given User Launch the browser
When user opens URL "https://qa-practice.netlify.app/auth_ecommerce.html"
And User enters the Email as "admin@admin.com" and Password as "admin123"
And click on login
Then user navigates to shopping cart page
And close the browser



