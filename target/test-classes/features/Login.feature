Feature: Application Login 

Scenario: Home Page default login 
	Given User is on NetBanking landing page 
	When User login into application with username and password 
	Then Homepage is populated 
	And Cards are displayed