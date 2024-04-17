Feature: Contacts TestCases

@contact25
Scenario: Create new contact
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Click on the button "newbtn"
Then User Enter into the text box "lastname" "Patel123"
Then User Enter into the text box "accname" "Grand Hotels & Resorts Ltd"
Then Click on the button "save"

@contact26
Scenario: Create new view in the Contact Page
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Click on link "CreateNewView"
Then User Enter into the text box "ViewName" "Harry"
Then User Enter into the text box "ViewUniqueName" "Harry123"
Then Click on the button "Save"

@contact27
Scenario: Check recently created contact in the Contact Page
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Select Text from DropDown "RecentlyCreated" "Recently Created"

@contact28
Scenario: Check 'My contacts' view in the Contact Page
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Select Text from DropDown "viewDropdown" "My Contacts"

@contact29
Scenario: View a contact in the contact Page
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Click on link "recentcontact"

@contact30
Scenario: Check the Error message if, the required information is not entered while creating a New view in Contacts
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Click on link "newview"
Then User Enter into the text box "ViewUniqueName" "EFGH"

@contact31
Scenario: Check the Error message if, the required information is not entered while creating a New view in Contacts
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Click on link "newview"
Then User Enter into the text box "ViewName" "ABCD"
Then User Enter into the text box "ViewUniqueName" "EFGH"
Then Click on the button "cancel"

@contact32
Scenario: Check the Error message if, the required information is not entered while creating a New view in Contacts
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "contact"
Given User is on "ContactsPage"
Then Click on link "newview"
Then User Enter into the text box "lastname1" "Indian"
Then User Enter into the text box "AccountName1" "Global Media"
Then Click on the button "SaveAndNew"



