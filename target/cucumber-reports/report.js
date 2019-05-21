$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CurrencyChange.feature");
formatter.feature({
  "line": 3,
  "name": "user should be able to change currency",
  "description": "",
  "id": "user-should-be-able-to-change-currency",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@currencyChange"
    }
  ]
});
formatter.before({
  "duration": 4988548200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user is able to change currency",
  "description": "",
  "id": "user-should-be-able-to-change-currency;user-is-able-to-change-currency",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on item",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on change currency",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should able to change currency",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.userIsOnHomepage()"
});
formatter.result({
  "duration": 86872200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.userClickOnItem()"
});
formatter.result({
  "duration": 1878276500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.clickOnChangeCurrency()"
});
formatter.result({
  "duration": 2296092300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.userShouldAbleToChangeCurrency()"
});
formatter.result({
  "duration": 57192300,
  "status": "passed"
});
formatter.after({
  "duration": 50900,
  "status": "passed"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 2,
  "name": "User should able to register successfully,",
  "description": "so that he can use all user feature from our website",
  "id": "user-should-able-to-register-successfully,",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@register"
    }
  ]
});
formatter.before({
  "duration": 4353984400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to register",
  "description": "",
  "id": "user-should-able-to-register-successfully,;user-should-able-to-register",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on register page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter all registration details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_register_page()"
});
formatter.result({
  "duration": 26649700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.userEnterAllRegistrationDetails()"
});
formatter.result({
  "duration": 2702770600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.userShouldAbleToRegisterSuccessfully()"
});
formatter.result({
  "duration": 21323100,
  "status": "passed"
});
formatter.after({
  "duration": 14300,
  "status": "passed"
});
});