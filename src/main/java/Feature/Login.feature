Feature: Login into elearining site

Scenario: Login into elearining site
    Given Open http://elearningm1.upskills.in/index.php
    And Click signUp
    When YOu need to fill up the registeration Form for all mandatory fields
    And click on Submit button
    And Verify Message "Your personal settings have been registered."
    Then Click on Next 
    And Verify home page title
    And click your username 
	 	And Choose profile from Dropdown 
	 	And Click on Messages
		And Click on Compose message
 

