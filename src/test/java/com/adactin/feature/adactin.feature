Feature: Automating the Adactin Web Application

Scenario: User logging in the page.

Given user Launch The Application

When user Enter The Username In Username Field

And user Enter The Password In The Password field

Then user Click The Login Button It Navigates To Search Hotel Page


Scenario: User searching the hotel.

When user Choose The Location
And user Choose The Hotel
And user Choose The Roomtype
And user Choose The No of Room
And user Enter The Check In Date
And user Enter The Chech Out Date
And user Choose The Adults Per Room
And user Choose The Childs Per Room
Then user Click The Search Button

Scenario: user Select The Hotel

When user Clicks The Selected Hotel
Then user Clicks The Continue Button

Scenario: user giving the personal details.

When user Enters The Firstname
And user Enters The Lastname
And user Enters The Billingaddress
And user Enters The Creditcard Number
And user Choose The Creditcard Type
And user Choose The Expiry Date
And user Choose The Expiry Year
And user Enter The Cvv
Then user Clicks The BookNow Button

Scenario:

Then user Takes Screenshot















