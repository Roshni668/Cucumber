Feature: Leads TestCases

@Leads20
Scenario: check leads tab link 
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Leads"
Given User is on "LeadsPage

@Leads21
Scenario: click on Leads drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Leads"
Given User is on "LeadsPage"
Then Click on DropDown "leadsdrpwn" 
#Then User Verify DropDown "<leadsdrpwn>"
#Examples:
#			| All Open Leads       |
      #| My Unread Leads      |
      #| Recently Viewed Leads|
      #| Today's Leads        |
      
@Leads22
Scenario: click on Leads drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Leads"
Given User is on "LeadsPage"
Then Click on DropDown "leadsdrpwn" 
Then Select Text from DropDown "leadsdrpwn" "My Unread Leads"
Then go back to Menu "UserMenu"
Then Click on the button "UserMenu"
And Click on link "Logout"
#Given User is on "LoginPage"
#Then User wait for Element "Username"
#Then User Enter into the text box "Username" "roshni@patel.com"
#Then User Enter into the text box "Password" "Pankti123"
#Then Click on the button "Login"
#Given User is on "HomePage"
#Then Click on link "Leads"

#"Logout" 31morg.openqa.selenium.TimeoutException: Expected condition failed
#.ElementNotInteractableException: element not interactable

@Leads23
Scenario: Todays Leads
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Leads"
Given User is on "LeadsPage"
Then Click on DropDown "leadsdrpwn" 
Then Select Text from DropDown "leadsdrpwn" "Today's Leads"

@Leads24
Scenario: New Leads
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Leads"
Given User is on "LeadsPage"
Then Click on the button "newbtn"
Then User Enter into the text box "lastname" "ABCD"
Then User Enter into the text box "company" "ABCD"
Then Click on the button "save"
