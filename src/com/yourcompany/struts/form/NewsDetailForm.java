/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-03-2017
 * 
 * XDoclet definition:
 * @struts.form name="newsDetailForm"
 */
public class NewsDetailForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** newsNum property */
	private String newsNum;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the newsNum.
	 * @return String
	 */
	public String getNewsNum() {
		return newsNum;
	}

	/** 
	 * Set the newsNum.
	 * @param newsNum The newsNum to set
	 */
	public void setNewsNum(String newsNum) {
		this.newsNum = newsNum;
	}
}