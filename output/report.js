$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/sample.feature");
formatter.feature({
  "name": "Sample API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Be Able to get all samples",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "client calls list samples",
  "keyword": "When "
});
formatter.match({
  "location": "SampleStepdefs.clientCallsListSamples()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the client receives OK response",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleStepdefs.theClientReceivesOKResponse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the client receives list of samples",
  "keyword": "And "
});
formatter.match({
  "location": "SampleStepdefs.theClientReceivesListOfSamples()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Be able to get one sample",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "client call get sample with 1",
  "keyword": "When "
});
formatter.match({
  "location": "SampleStepdefs.clientCallGetSampleWith(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the client receives OK response",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleStepdefs.theClientReceivesOKResponse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the client receives sample with id 1",
  "keyword": "And "
});
formatter.match({
  "location": "SampleStepdefs.theClientReceivesSampleWithId(int)"
});
formatter.result({
  "status": "passed"
});
});