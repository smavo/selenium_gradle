$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ListPagesTest.feature");
formatter.feature({
  "name": "I can find a city inside a state.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As a Test Engineer, I want to validate that a text is present inside the list.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "name": "I navigate to the list page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search \u003cstate\u003e in the list",
  "keyword": "When "
});
formatter.step({
  "name": "I can find \u003ccity\u003e in the list",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "state",
        "city"
      ]
    },
    {
      "cells": [
        "Washington",
        "Seattle, Washington"
      ]
    },
    {
      "cells": [
        "Chicago",
        "Chicago, Illinois"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a Test Engineer, I want to validate that a text is present inside the list.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "name": "I navigate to the list page",
  "keyword": "Given "
});
formatter.match({
  "location": "ListSteps.navigateToListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search Washington in the list",
  "keyword": "When "
});
formatter.match({
  "location": "ListSteps.searchTheList(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can find Seattle, Washington in the list",
  "keyword": "Then "
});
formatter.match({
  "location": "ListSteps.theCityIsThere(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a Test Engineer, I want to validate that a text is present inside the list.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "name": "I navigate to the list page",
  "keyword": "Given "
});
formatter.match({
  "location": "ListSteps.navigateToListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search Chicago in the list",
  "keyword": "When "
});
formatter.match({
  "location": "ListSteps.searchTheList(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can find Chicago, Illinois in the list",
  "keyword": "Then "
});
formatter.match({
  "location": "ListSteps.theCityIsThere(String)"
});
formatter.result({
  "status": "passed"
});
});