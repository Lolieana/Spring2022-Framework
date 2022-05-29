$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook/login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "# Scenario name"
    }
  ],
  "line": 6,
  "name": "Verify user cannot login with invalid credentials",
  "description": "",
  "id": "facebook-login;verify-user-cannot-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@invalidFbLogin"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "# steps (Gherkin steps)"
    }
  ],
  "line": 8,
  "name": "I am on facebook landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter $%^\u0026*( in login username",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter abcd@1234 in login password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify error is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.openFacebook()"
});
formatter.result({
  "duration": 9686789041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$%^\u0026*(",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 24
    }
  ],
  "location": "LoginSD.enterLoginCredentials(String,String)"
});
formatter.result({
  "duration": 381173834,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@1234",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 27
    }
  ],
  "location": "LoginSD.enterLoginCredentials(String,String)"
});
formatter.result({
  "duration": 136720625,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.clickLoginBtn()"
});
formatter.result({
  "duration": 433487000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.isLoginErrorDisplayed()"
});
formatter.result({
  "duration": 3457301792,
  "status": "passed"
});
});