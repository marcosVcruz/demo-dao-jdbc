package model.dao;

import db.DB;
import model.model.dao.impl.DepartmentDaoJDBC;
import model.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao creatDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
