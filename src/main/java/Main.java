import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.dao.AccesorieDaoImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main (String [] args) throws SQLException {
        SingletonDatabaseConnection.getInstance();
        Connection s = SingletonDatabaseConnection.getConnection();
        System.out.println(s);
        Connection d = SingletonDatabaseConnection.getConnection();
        System.out.println(d);
        AccesorieDaoImpl a = new AccesorieDaoImpl();
        System.out.println(a.getAllAccesories());
    }
}
