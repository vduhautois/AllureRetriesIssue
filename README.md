# AllureRetriesIssue
Run test with
```
mvn clean test -Dtest=allure.AllureRetriesIssueTest#shouldGenerateAFlakyTest -Dsurefire.rerunFailingTestsCount=2
```
Then you can use maven allure plugin to generate or serve the report
```
mvn allure:report
mvn allure:serve
```
