databaseChangeLog = {

    changeSet(author: "alexanderfranke (generated)", id: "1465390511706-1") {
        createTable(tableName: "example") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "examplePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "this_isastring", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "this_is_text", type: "CLOB") {
                constraints(nullable: "false")
            }
        }
    }
}
