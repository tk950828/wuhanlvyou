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

import com.dao.imp.HistoricImp;
import com.entity.HistoryMessage;
import com.yourcompany.struts.form.HistoryAddForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-07-2017
 * 
 * XDoclet definition:
 * @struts.action path="/template/historyAdd" name="historyAddForm" input="/form/historyAdd.jsp" scope="request" validate="true"
 * @struts.action-forward name="success" path="/successJsp.jsp"
 */
public class HistoryAddAction extends Action {
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
		HistoryAddForm historyAddForm = (HistoryAddForm) form;// TODO Auto-generated method stub
		String id = historyAddForm.getId();
		String title = historyAddForm.getTitle();
		String user = historyAddForm.getUser();
		String date = historyAddForm.getDate();
		String text = historyAddForm.getText();
		HistoryMessage n = new HistoryMessage(id, user, title, date, text);
		HistoricImp h = new HistoricImp();
		boolean flag = h.addHistory(n);
		
		String jsonString = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", flag);
		jsonString = JSONSerializer.toJSON(map).toString();
		System.out.println(jsonString);
		request.setAttribute("data", jsonString);
		return mapping.findForward("success");
	}
}