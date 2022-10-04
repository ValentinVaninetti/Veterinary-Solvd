import com.solvd.dao.AccesoryDaoImpl;
import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.pojos.Client;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import com.solvd.pojos.Doctor;
import com.solvd.pojos.Equipment;
import com.solvd.utils.XMLConverter;
import com.solvd.utils.JSONConverter;
import jakarta.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws SQLException, JAXBException, IOException {

        SingletonDatabaseConnection.getInstance();
        Connection s = SingletonDatabaseConnection.getConnection();
        System.out.println(s);
        Connection d = SingletonDatabaseConnection.getConnection();
        System.out.println(d);
        AccesoryDaoImpl a = new AccesoryDaoImpl();
        System.out.println(a.getById(5).toString());
        System.out.println(a.getById(6).toString());
        System.out.println(a.getById(7).toString());
        System.out.println(a.getById(8).toString());
        System.out.println(a.getById(1).toString());
        Client asd = new Client(2,"derek", 27, "someDog");
        XMLConverter ctl = new XMLConverter();
        ctl.marshall(asd);
        ctl.unMarshall();
        Doctor doc = new Doctor(1, "doc", 32, 5);
        Doctor doc2 = new Doctor(2, "doc2", 45, 3);
        Date eqDate =  new Date();
        Equipment eq =  new Equipment(1, "xRay-Machine", eqDate);
        JSONConverter dtj =  new JSONConverter();
        dtj.serializeObject(doc);
        dtj.serializeObject(doc2);
        dtj.serializeObject(eq);
        dtj.deserializeObject(Equipment.class);

    }
}
