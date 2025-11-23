✈ Flight Price Scraper using Selenium (Java)

This project is an automated flight price extraction tool built using Java, Selenium WebDriver, and ChromeDriver.
It navigates to a flight booking website, selects departure and destination cities, searches for available flights, and extracts the lowest flight prices from the results table.

🚀 Features

Automates browser actions using Selenium WebDriver

Selects source and destination cities dynamically using dropdowns

Clicks the Find Flights button and waits for results to load

Extracts all flight prices from a table using XPath

Converts extracted prices from String → double

Stores values inside a List and identifies the lowest flight price

Useful for automation testing practice, data extraction, or Selenium learning projects


🛠 Technologies Used

Java

Selenium WebDriver

ChromeDriver

XPath Locators

Collections Framework (ArrayList)


📌 How It Works

1. Launch Chrome Browser


2. Open the flight booking website


3. Select:

Departure city (e.g., Boston)

Destination city (e.g., London)



4. Click Find Flights


5. Extract all prices listed in the results table


6. Parse them to numeric values


7. Print and compare to get the lowest fare



🎯 Output

List of all flight prices extracted from the page

Printed lowest flight price

Validated automated test flow for dropdown selection, button click, and table data reading


📚 Use Cases

Selenium Automation Practice

Web Scraping Learning

Java Collections & XPath Hands-on

Validated automated test flow for dropdown selection, button click, and table data reading

