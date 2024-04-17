Feature: Login scenarios


@login1
Scenario: Login with valid username and clear password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" ""
Then Click on the button "Login"
Then User verifies the Message "Error" "Please enter your password."

@login2
Scenario: Login with valid username and password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"

@login3
Scenario: Login with the remember username check box 
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then User Click on Checkbox "RememberMe"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on user menu dropdown "UserMenu"
Then Click on link "Logout"
Given User is on "LoginPage"
#Then User verifies the text box "SavedUsername" "roshni@patel.com"

@loging4A
Scenario: Login with valid username and clear password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then Click on link "ForgotYourPassowrd"
Then User Enter into the text box "UsernameForgotPassword" "roshni@patel.com"
Then Click on the button "Continue"

@login4B
Scenario: Login with valid username and password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
#Then Click on link "Clearusername"
Then User Enter into the text box "Username" "123"
Then User Enter into the text box "Password" "22131"
Then Click on the button "Login"
Then User verifies the Message "Error1" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
