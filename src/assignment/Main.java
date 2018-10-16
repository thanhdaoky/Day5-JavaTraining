package assignment;

import dataManager.DAO;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.getCarData();
        dao.getBestSaler();
        dao.removeCanceledOrderLastYear();
        dao.findCustomersHaveOrdered(1);
    }
}
