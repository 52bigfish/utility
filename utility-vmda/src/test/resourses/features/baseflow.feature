@base_flow
Feature: cm

  @base_flow1
  Scenario: Check cm CMJobDataSourceCucumberTest.java
    #Given <type>,<url>,<timezone>,<redanduncyUrl>
    #Given seta paramsa <type>,<url>,<timezone>,<redanduncyUrl>
    Given seta paramsa 
    When test init equals false
    Then test prepare data equals false

    #Examples: 
      #| type     | url                            | timezone        | redanduncyUrl                  |
      #| "NSP"    | "sftp://root:root@10.1.1.1/cm" | "Asia/Shanghai" | "sftp://root:root@10.1.1.2/cm" |
      #| "NETACT" | "sftp://root:root@10.1.1.1/cm" | "Asia/Shanghai" | "null"                         |

  @base_flow2
  Scenario: Check cm BaseSteps.java
    #Given test init equals value 1
    #When test run equals value "b"
    Given the 1
    When the "b"
