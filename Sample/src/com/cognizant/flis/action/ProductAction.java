package com.cognizant.flis.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ProductAction extends DispatchAction {

	public ActionForward toAddProduct(ActionMapping mapping,ActionForm actionform,HttpServletRequest request,HttpServletResponse response){
    	return mapping.findForward("addProduct");
    }
    public ActionForward toSearchProduct(ActionMapping mapping,ActionForm actionform,HttpServletRequest request,HttpServletResponse response){
    	return mapping.findForward("searchProduct");
    }
}
