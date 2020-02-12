Feature: Sample API
  Scenario: Be Able to get all samples
    When client calls list samples
    Then the client receives OK response
    And the client receives list of samples

  Scenario: Be able to get one sample
    When client call get sample with 1
    Then the client receives OK response
    And the client receives sample with id 1
