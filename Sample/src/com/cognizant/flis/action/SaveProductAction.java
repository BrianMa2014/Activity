package com.cognizant.flis.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cognizant.flis.entity.ProductForm;
import com.cognizant.flis.service.ProductService;

public class SaveProductAction extends Action {
	 // 在客户端访问saveProduct动作时执行该方法
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
    {
        ProductForm saveProductForm = (ProductForm) form;//ProductForm相当于Struts2中的Product(PoJo)
        String flag ="error";
        try
        {
        	System.out.println("产品ID:"+saveProductForm.getProductID());
        	System.out.println("产品名称："+saveProductForm.getProductName());
        	System.out.println("产品价格"+saveProductForm.getPrice());
            ProductService ps = new ProductService(saveProductForm);
            ps.save();  // 保存产品信息
            request.setAttribute("info", "保存成功!"); 
            flag ="success";
        }
        catch (Exception e)
        {
            request.setAttribute("info", e.getMessage());
        }
        return mapping.findForward(flag);
    }
}
