@suite
Feature: Accessible user journey
  As a tester
  I want to test web pages for accessibility
  So I can be sure that it does not contain critical accessibility issues

  Scenario: Test accessibility for Google.com
    Given user navigates to 'http://google.com' web page
    Then accessibility test is executed on the open page

  Scenario: Test accessibility for bbc.co.uk
    Given user navigates to 'http://bbc.co.uk' web page
    Then accessibility test is executed on the open page