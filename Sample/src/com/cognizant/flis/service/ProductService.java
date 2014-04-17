package com.cognizant.flis.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cognizant.flis.dao.DaoHelper;
import com.cognizant.flis.entity.ProductForm;

public class ProductService {
	private ProductForm form;
	  public ProductService(ProductForm form) throws Exception
      {
          super();
          this.form = form;
      }
	// 将客户端提交的产品信息保存到t_products中
    public void save() throws Exception
    {
    	Connection conn=DaoHelper.getConn();
        try
        {
            String productID = form.getProductID();
            String productName = form.getProductName();
            float price = form.getPrice();
            String sql = "INSERT INTO t_products VALUES('" + productID + "',"
                    + "'" + productName + "'," + String.valueOf(price) + ")";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();   // 执行INSERT语句
            pstmt.close();
            conn.close();
            System.out.println("插入成功");
        }
        catch (Exception e)
        {
        	System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
