package DAO;

/*
 * @author Shyam Makwana
 */

public class DAOFactory {

    public static CircleDAO getCircleDAO(String sourceType) {
        switch (sourceType) {
            case "RDBMS":
                return new RDBMSDAO();
        }
        return null;
    }
}