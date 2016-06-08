# migrationTest
test app to show bug in grails-database-migration plugin

## How to run
- clone repository
- run `./gradlew dbmUpdate` to execute migrations once
- run `./gradlew dbmGormDiff` to get the diff between the database and the current Domain model
- even though, the last commit added a member of type Integer and changed the mapping of the `thisIsAString` member to `type: 'text'`, there is only one change in the diff:

```
databaseChangeLog = {

    changeSet(author: "alexanderfranke (generated)", id: "1465390799555-1") {
        addColumn(tableName: "example") {
            column(name: "a_number", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }
}
```
