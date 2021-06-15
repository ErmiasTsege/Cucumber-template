#Author: ermileb2020@gmail.como

Feature: Test Google search page

Scenario: Test searching cats in google page
	Given that I have gone to the Google page
	When I add cats to the search box
	And click the Search icon
	Then cats should be mentioned in the results

#Scenario: Test searching dogs in google page
#	Given that I have gone to the Google page
#	When I add dogs to the search box
#	And click the Search Button
#	Then dogs should be mentioned in the results