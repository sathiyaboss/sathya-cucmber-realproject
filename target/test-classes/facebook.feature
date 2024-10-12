Feature: 
To validate login functioslity
Background: 
Given : To user launch chrome browser and faceboook url 

@smoke 
Scenario:
To valoidate login with invalid username and invalid password
When : TO user enter invalid username and invalid password 
|sathya|keshav|jothi|7567|3535|
|hindhu|muslim|christian|123|456|
|matha|pitha|guru|deivam|123789|
And : To user click login button and verify invalid account message
Then : To user take a screen shot 



Scenario: 
To validate forget password functionality
When : TO user click forget password button 
And : To user enter email address or phone number 
Then : To user enter into valid or invalid credential page 
