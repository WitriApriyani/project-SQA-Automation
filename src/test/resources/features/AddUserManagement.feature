Feature: Add user

	Scenario: Add user management
		When navigate dashboard page
		And click user management menu
		And click admin menu
#		And click add button
#		And fill user data form with "admin" as privileges and "developer" as supervisor
#		And click button save
#		And click yes button on confirmation dialog box
		Then user added to table

   