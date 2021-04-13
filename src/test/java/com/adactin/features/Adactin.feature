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
When user Select The Location In Search Hotel
And user Select The Hotels In Search Hotel
And user Select The Room Type In Search Hotel
And user Select The Number Of Rooms In Search Hotel
And user Enter The Check In Date In Search Hotel
And user Enter The Check Out Date In Search Hotel
And user Select The Adults Rooms In Field
And user Select The Children Rooms In Field
Then user Click The Search And It Navigates To Booked Itinarary

Scenario:
When user Click The Select 
Then user Click The Continue In Field

Scenario:
When user Enter The First Name In Book A Hotel
And user Enter The Last Name In Book A Hotel
And user Enter The Billing Address In Book A Hotel
And user Enter The Credit Card Number In Book A Hotel
And user Select The Credit Card Type In Book A Hotel 
And user Select The Expiry Month 
And user Select The Expiry Year In Book A Hotel
And user Enter The CVV Number In Book A Hotel
Then user Click The Book Now And It Navigates to Booking Confirmation

Scenario:
Then user Click The My Itinerary And Navigates to Logout Field

Scenario:
Then user Click The Logout
 


