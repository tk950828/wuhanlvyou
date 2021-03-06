/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.imp.LeaveImp;
import com.yourcompany.struts.form.LeaveForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-03-2017
 * 
 * XDoclet definition:
 * @struts.action path="/leave" name="leaveForm" input="/template/leave.html" scope="request" validate="true"
 * @struts.action-forward name="success" path="/successJsp.jsp"
 */
public class LeaveAction extends Action {
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
		LeaveForm leaveForm = (LeaveForm) form;// TODO Auto-generated method stub
		LeaveImp l = new LeaveImp();
		String user = leaveForm.getTxtUserName();
		String phone = leaveForm.getTxtUserTel();
		String sex = leaveForm.getTxtUserSex();
		String message = leaveForm.getTxtContent();
		String code = leaveForm.getTxtCode();
		l.insertLeaveMessage(EnCodeUtil.enCode(user), phone, EnCodeUtil.enCode(sex), EnCodeUtil.enCode(message));
//		System.out.println(EnCodeUtil.enCode(message));
		return null;
	}
}