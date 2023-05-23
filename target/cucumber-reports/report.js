$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("placeValidations.feature");
formatter.feature({
  "line": 1,
  "name": "Validating Place API\u0027s",
  "description": "",
  "id": "validating-place-api\u0027s",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify if Place is being successfully added using AddPlaceAPI",
  "description": "",
  "id": "validating-place-api\u0027s;verify-if-place-is-being-successfully-added-using-addplaceapi",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Add Place Payload",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user calls \"AddPlaceAPI\" with post http request",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The API call is success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "\"status\" in response body is \"Ok\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "\"scope\" in response body \"APP\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});