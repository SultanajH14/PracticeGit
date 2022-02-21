

Feature: Validate the FaceBook login scenario

Background:
Given open browser


When go to url

@smoke 
Scenario: A user should not login invalid credential

And user type "<userId>" in the textbox
And user type "<password>" in the textbox
And click on login button
 
Then show invalid message
And close browser

Scenario: A user should  login invalid credential

And user type "<userId>" in the textbox
And user type "<password>" in the textbox
And click on login button
 
Then successfully Login 
And close browser