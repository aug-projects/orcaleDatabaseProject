package database;

public class DAO {

    public DAO() {
        try {
            java.sql.Connection connection = Connection.getInstance().getConnection();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}
