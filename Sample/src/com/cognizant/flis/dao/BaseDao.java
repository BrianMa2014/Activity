package com.cognizant.flis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BaseDao {
    private Connection conn;
    private PreparedStatement pstmt;
    
    public void save(String sql){
    	conn =DaoHelper.getConn();
    }
}
