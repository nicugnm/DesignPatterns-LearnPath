package ro.nicolaemariusghergu.dependencyInversion;

interface DBConnectionInterface {

    public int connect();
}

class MySQLConnection implements DBConnectionInterface {

    public int connect() {
        return 1;
    }
}

public class PasswordReminder {

    private DBConnectionInterface dbConnection;

    public PasswordReminder(MySQLConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
