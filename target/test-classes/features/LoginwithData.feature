Feature: Application Login 

Scenario: Home Page default login 
	Given User is on NetBanking landing page 
	When User login into application with "Ram" and password "1234" 
	Then Homepage is populated 
	And Cards displayed are "false"
	
	
	Scenario: Home Page default login 
	Given User is on NetBanking landing page 
	When User login into application with "Shyam" and password "4567"
	Then Homepage is populated 
	And Cards displayed are "true"