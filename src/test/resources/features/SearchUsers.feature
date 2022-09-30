Feature: Search Data Users

  Scenario: Search Data Active
  When navigate to dashboard page search users
	And click task menu search users
	And click data users search users
	And filter as active search users
	Then data displayed search users
		
		Scenario: Search Data By Email 
		When navigate to dashboard page user
		And click task menu user
		And click data users user
		And input email users user 
		Then data displayed user
		
		Scenario: Export Data Users
		When navigate to dashboard page
		And click task menu
		And click data users
		And click export
		Then the data will be download as Excel