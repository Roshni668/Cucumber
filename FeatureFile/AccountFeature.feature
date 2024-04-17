Feature: Account TestCases

@account10
Scenario: Create an Account
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Accounts"
Given User is on "AccountPage"
Then Click on the button "newtab"
Then User Enter into the text box "AccountName" "Roshni"
Then Click on DropDown "typedropdown" 
Then Select Text from DropDown "typedropdown" "Technology Partner"
Then Click on DropDown "customerdropdown" 
Then Select Text from DropDown "customerdropdown" "High"
Then Click on the button "save" 

@account11
Scenario: Create new view
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Accounts"
Given User is on "AccountPage"
Then Click on link "Createnewview"
Then User Enter into the text box "viewname" "Roshni"
Then User Enter into the text box "uniqueviewname" "123"
Then Click on the button "save1" 

@account12
Scenario: Edit view
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Accounts"
Given User is on "AccountPage"
Then Click on DropDown "viewdropdn" 

@account13
Scenario: Merge accounts
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Accounts"
Given User is on "AccountPage"
Then Click on link "Mergeaccount"
Then User Enter into the text box "findacctext" "Roshni"
Then Click on the button "findbtn"
Then User Click on Checkbox "checkbox1"
Then User Click on Checkbox "checkbox2"
Then Click on the button "next"
Then Click on the button "merge"
Then Accept Alert 


@account14
Scenario: Create account report
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "Accounts"
Given User is on "AccountPage"
Then Click on link "lastactivity"
Then Click on link "Datefrom"
Then Click on the button "todaybtnfrom"
Then Click on link "DateTO"
Then Click on the button "todaybtnTo"
Then Click on the button "save2"
Then User Enter into the text box "Reportname" "NewReport"
Then User Enter into the text box "reportuniquename" "NewReport1"
Then Click on the button "savenrun"







