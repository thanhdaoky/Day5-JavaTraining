package assignment;

import databaseManager.DAO;
import databaseManager.DBConnector;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.getCarData();
        dao.getBestSaler();
        dao.removeCanceledOrderLastYear();
        dao.findCustomersHaveOrdered(1);
    }
}
