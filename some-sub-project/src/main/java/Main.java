import io.logz.com.mysql.cj.jdbc.exceptions.MySQLQueryInterruptedException;

public class Main {
    public static void main(String[] args) throws MySQLQueryInterruptedException {
        try {
            Class.forName(io.logz.com.mysql.cj.jdbc.MysqlDataSource.class.getName());
            Class.forName(com.mysql.jdbc.jdbc2.optional.MysqlDataSource.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
