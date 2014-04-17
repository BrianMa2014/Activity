package com.cognizant.flis.entity;

import org.apache.struts.action.ActionForm;

public class ProductForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String productID;  // 产品ID
    private String productName; // 产品名称
    private float price;  // 产品价格
    public String getProductID()
    {
        return productID;
    }
    public void setProductID(String productID)
    {
        this.productID = productID;
    }
    public String getProductName()
    {
        return productName;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }
}
