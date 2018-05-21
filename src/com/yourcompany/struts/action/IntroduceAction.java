/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONSerializer;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.imp.HistoricImp;
import com.entity.HistoryMessage;
import com.yourcompany.struts.form.IntroduceForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-06-2017
 * 
 * XDoclet definition:
 * @struts.action path="template/introduce" name="introduceForm" input="/form/introduce.jsp" scope="request" validate="true"
 * @struts.action-forward name="success" path="/successJsp.jsp"
 */
public class IntroduceAction extends Action {
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
		IntroduceForm introduceForm = (IntroduceForm) form;// TODO Auto-generated method stub
		HistoricImp h = new HistoricImp();
		List<HistoryMessage> nlist = new ArrayList<HistoryMessage>();
		nlist.add(h.getMessageById(1));
		String jsonString = null;
		Map<String, Object> map = new HashMap<String , Object>();
		map.put("result", nlist);
		jsonString = JSONSerializer.toJSON(map).toString();
		request.setAttribute("data", jsonString);
		return mapping.findForward("success");
	}
}