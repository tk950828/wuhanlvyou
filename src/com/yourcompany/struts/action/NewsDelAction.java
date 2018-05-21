/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONSerializer;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.imp.NewImp;
import com.yourcompany.struts.form.NewsDelForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-07-2017
 * 
 * XDoclet definition:
 * @struts.action path="/template/newsDel" name="newsDelForm" input="/form/newsDel.jsp" scope="request" validate="true"
 * @struts.action-forward name="success" path="/successJsp.jsp"
 */
public class NewsDelAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		NewsDelForm newsDelForm = (NewsDelForm) form;// TODO Auto-generated method stub
		String id = newsDelForm.getId();
		NewImp n = new NewImp();
		boolean flag = n.DelNewsById(id);
		
		String jsonString = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", flag);
		jsonString = JSONSerializer.toJSON(map).toString();
		System.out.println(jsonString);
		request.setAttribute("data", jsonString);
		return mapping.findForward("success");
	}
}