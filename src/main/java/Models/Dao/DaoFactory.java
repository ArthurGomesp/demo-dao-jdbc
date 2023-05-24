package Models.Dao;

import Models.Impl.SellerDaoJdbc;

public class DaoFactory {

    public static SellerDao CreateSellerDao(){
        return new SellerDaoJdbc();
    }
}
