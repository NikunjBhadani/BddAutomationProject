$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16865656569,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to register successfully.",
  "description": "",
  "id": "registration-feature;user-should-able-to-register-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter all registration details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on register-submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 155476385,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_register_button()"
});
formatter.result({
  "duration": 4946498900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enter_all_registration_details()"
});
formatter.result({
  "duration": 4597046357,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_register_submit_button()"
});
formatter.result({
  "duration": 3012741330,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 107164983,
  "status": "passed"
});
formatter.after({
  "duration": 80020119,
  "status": "passed"
});
});