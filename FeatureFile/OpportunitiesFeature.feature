Feature: opportunities drop down Scenarios

@opportunities15
Scenario: opportunities drop down
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "opportunity"
Given User is on "OpportunitiesPage"
Then Click on DropDown "opportunitydropwn" 
#And I verify the dropdown is present with options "opportunitydropwn"
      #| All Opportunities        |
      #| Closing Next Month       |
      #| Closing This Month       |
      #| My Opportunities         |
      #| New This Week            |
      #| Recently Viewed Opportunities |
      #| Won        |
      
@opportunities16
Scenario: Create a new Opty
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "opportunity"
Given User is on "OpportunitiesPage"
Then Click on the button "newopportunity" 
Then User Enter into the text box "oppname" "New"
Then User Enter into the text box "accname" "Roshni"
Then User Enter into the text box "closedate" "4/28/2024"
Then Click on the button "save" 

@opportunities17
Scenario: Test Opportunity Pipeline Report
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "opportunity"
Given User is on "OpportunitiesPage"
Then Click on DropDown "opportunitydropwn" 
Then Select Text from DropDown "opportunitydropwn" "Opportunity Pipeline"

@opportunities18
Scenario: Test Stuck Opportunities Report
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "opportunity"
Given User is on "OpportunitiesPage"
Then Click on link "stuckopportunity"

@opportunities19
Scenario: Test Quarterly Summary Report
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User wait for Element "Username"
Then User Enter into the text box "Username" "roshni@patel.com"
Then User Enter into the text box "Password" "Pankti123"
Then Click on the button "Login"
Given User is on "HomePage"
Then Click on link "opportunity"
Given User is on "OpportunitiesPage"
Then Select Text from DropDown "Interval" "Current and Next FQ"
Then Select Text from DropDown "Include" "Open Opportunities"
Then Click on the button "runreport"


