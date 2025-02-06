Feature: Login salesforce

Scenario: Login with positive data
Given Enter the username as 'dilip@testleaf.com'
And Enter the password as 'Test@2025'
When Click on login button
Then Verify the Title
Then Click on toggle menu button from the left corner
Then Click view All from App Launcher
Then Click on Content tab 
Then Click View All from Today's Task
Then Click on Task and click New Task
Then Select a Account Name in Assigned to field 
Then Select a subject as Email and Status as In Progress
Then Click on the image of Name field and click on Contacts and select Contact
Then Set Priority as High
Then Click on the image of Related To field, click on Product and Select Product
Then Click Save
