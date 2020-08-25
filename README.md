# AutomationTestingQA
Assignment to test the automation of test process.
Selenium is a powerful tool to perform functional and regression testing which works on client and server design, SeleniumCore component which plays the role of the foundation of the framework, SeleniumTest component contains all test cases that use the classes provided by SeleniumCore.
Selenium IDE(Integrated Development Environment) – It is a framework which is used to automate web application only. it is a record and playback combination tool which is used to automate web app in Firefox and Chrome browser.
Selenium WebDriver – Selenium webdriver is a webpage automation tool.while is used to automation web page only. There isn’t any need for a server to work with Selenium WebDriver. Its directly connect to browsers using driver.
Frameworks are software that is developed and used by developers to build or test applications.
The Selenium framework helps in automation of the test cases using the selenium webdriver.
The choice of programming language for the framework is important, in our case we use Java as it works across different platforms.
Choice of the unit test framework is TestNG which is a powerful one to automate tests.
SeleniumCore is designed to manage the browser instances and element interactions,it helps create destroy Webdriver objects.
The WebDriver object drives a browser instance such as moving from web page to another,WebDriver object is used to execute a given test in a testflow.
The test classes use the Drivermanagerfactory to create Drivermanager objects for them and Drivermanagers include ChromeDriverManager,FirefoxDrivenManager,EdgeDriverManager with having methods as createWebDriver(),getWebDriver() and quitWebDriver.
Inorder to track the results of the test we use an open-source Java reporting library called ReportNG. It’s a simple HTML plug-in for the TestNG unit-testing framework that provides a simple, color-coded view of the test results.

We have created tests for basic authentication of a login page,to find all the broken images in a webpage,to find the max value of the slider in a webpage, to hover over pictures on a webpage.
The Test scripts use the Selenium WebDriver to create WebDriver Managers(ChromeDriveManager,IEdriveManager etc)for them and run the tests succesfully.
