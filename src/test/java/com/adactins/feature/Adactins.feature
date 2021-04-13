Feature: Hotel Booking In The Adactin Application

Scenario Outline:
Given user Lanuch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password field 
Then user Click On The Login Button And It Navigates To The Search Hotel

Examples:
|Username | Password |
|Adact0932| act093213|

Scenario:
Given user Lanuch The Hotel Reservation Application
When user Enter The Username In User Login
And user Enter The Password In User Login
Then user Click The Login And Navigates To Search Hotel
