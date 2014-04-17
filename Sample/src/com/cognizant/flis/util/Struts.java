package com.cognizant.flis.util;

import java.sql.Connection;

public class Struts {

	protected javax.naming.Context ctx = new javax.naming.InitialContext();
    protected javax.sql.DataSource ds;
    protected Connection conn;
    public Struts() throws Exception
    {
        ds = (javax.sql.DataSource) ctx.lookup("java:/comp/env/jdbc/struts");
        conn = ds.getConnection();  // 从数据库连接池获得一个Connection
    }
	
	
	
}
