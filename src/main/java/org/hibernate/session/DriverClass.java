package org.hibernate.session;

public enum DriverClass {
    JAVA_DB_EMBEDED("org.apache.derby.jdbc.EmbeddedDriver"),
    JAVA_DB_NETWORK("org.apache.derby.jdbc.ClientDriver"),
    MYSQL("com.mysql.jdbc.Driver"),
    ORACLE_OCI("oracle.jdbc.driver.OracleDriver"),
    ORACLE_THIN("oracle.jdbc.OracleDriver"),
    POSTGRESQL("org.postgresql.Driver");
    
    private String value;
    
    DriverClass(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
}
