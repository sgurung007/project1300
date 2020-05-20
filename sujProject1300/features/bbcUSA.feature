@bbc 
Feature: bbc search USA
Scenario: Verify the USA search title in bbc.com
Given Get to bbc
Then put Usa in search and search
And Verity the title of the page