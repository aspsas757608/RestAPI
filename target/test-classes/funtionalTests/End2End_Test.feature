Feature: Validate free APIs
Description: The purpose of this feature is to get info 
reqres.in site free APIs to test

Scenario: Verify to get single user
Given User access the URL
When User passes user id as "1"
Then Full info user in json format be displayed