package sample;

import sample.Animals.Animal;
import sample.DB.AnimalJDBCDao;
import sample.DB.ConnectionFactory;
import sample.DB.DBUtils;

import java.sql.Connection;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        try
        {
            DBUtils.initBD(connection);
            AnimalJDBCDao behaviorJDMCDao = new AnimalJDBCDao();

            Animal animal = new Animal();
            animal.setBehavior(1);
            animal.setCost(10);
            animal.setId(1);
            animal.setName("dgff");

            behaviorJDMCDao.insert(animal);
            var items = behaviorJDMCDao.getAll();
            for (var item:items) {
                System.out.println(item.get().toString());
            }

            connection.close();
        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

}
