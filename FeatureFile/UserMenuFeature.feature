Feature: User Menu Dropdown

@usermenu5
Scenario: Select user menu for <username> drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the button "UserMenu"

@usermenu6
Scenario: Select "My Profile" option from user menu for <username> drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the button "UserMenu"
Then Click on link "myProfile"
Then Click on link "EditProfile"
Then New Frame open "iframeditprofile"
Then Click on link "Abouttab"
Then User Clear the text box "Lastname"
Then User Enter into the text box "Lastname" "ABCD"
Then Click on the button "SaveAll"
Then switch to deafult page
Then Click on link "Post"
Then New Frame open "Postiframeditprofile"
Then User Enter into the text box "Textarea" "Hi..How are You?"
Then switch to deafult page
Then Click on the button "Share"
Then Click on link "File"
Then Click on the button "UploadFile"
Then switch to deafult page
Then upload Data "Choosefile" "C:\Users\hypat\eclipse\New Text Document.txt"
Then Click on the button "Share"
#Then Click on link "Photo"

@usermenu7
Scenario: Select "My settings" option from user menu for <username> drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on the button "UserMenu"
Then Click on link "mySetting"
Then Click on the button "Personal"
Then Click on link "loginhistory"
Then Click on the button "displaytab"
Then Click on link "customizetab"
#Then Click on the button "Personal"
#Then Click on link "loginhistory"



@usermenu8
Scenario: Select "Developers Console" option from user menu for <username> drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
When Click on the button "UserMenu"
#Then Drop down with "My profile", "My Settings", "Developer Console","Logout" is displayed
Then Click on link "DeveloperConsole"
Then Close the child window 

@usermenu9
Scenario: Select "Logout" option from user menu for <username> drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
When Click on the button "UserMenu"
#Then Drop down with "My profile", "My Settings", "Developer Console","Logout" is displayed
Then Click on link "Logout"