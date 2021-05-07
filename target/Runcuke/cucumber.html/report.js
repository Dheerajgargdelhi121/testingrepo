$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Social-imprints"
    }
  ]
});
formatter.before({
  "duration": 3174091100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "In order to verify login",
  "description": "",
  "id": "login;in-order-to-verify-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Social-imprints-login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigates to marin https://staging.dev.socialimprints.com/admin/sign_in",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the Sign in google",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user entered username \"demouser1@socialimprints.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user entered password \"qq11WW@@\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user logged successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_navigates_to_marin_https_staging_dev_socialimprints_com_admin_sign_in()"
});
formatter.result({
  "duration": 7541913300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_the_Sign_in_google()"
});
formatter.result({
  "duration": 14039200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demouser1@socialimprints.com",
      "offset": 23
    }
  ],
  "location": "LoginTest.user_entered_username(String)"
});
formatter.result({
  "duration": 25208800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qq11WW@@",
      "offset": 23
    }
  ],
  "location": "LoginTest.user_entered_password(String)"
});
formatter.result({
  "duration": 6296279200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_logged_successfully()"
});
formatter.result({
  "duration": 19634500,
  "status": "passed"
});
formatter.after({
  "duration": 1186825100,
  "status": "passed"
});
});