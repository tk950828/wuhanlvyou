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
 * Creation date: 03-07-2017
 * 
 * XDoclet definition:
 * @struts.form name="delicacyDelForm"
 */
public class DelicacyDelForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** id property */
	private String id;

	/** uesr property */
	private String uesr;

	/** els property */
	private String els;

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
	 * Returns the id.
	 * @return String
	 */
	public String getId() {
		return id;
	}

	/** 
	 * Set the id.
	 * @param id The id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** 
	 * Returns the uesr.
	 * @return String
	 */
	public String getUesr() {
		return uesr;
	}

	/** 
	 * Set the uesr.
	 * @param uesr The uesr to set
	 */
	public void setUesr(String uesr) {
		this.uesr = uesr;
	}

	/** 
	 * Returns the els.
	 * @return String
	 */
	public String getEls() {
		return els;
	}

	/** 
	 * Set the els.
	 * @param els The els to set
	 */
	public void setEls(String els) {
		this.els = els;
	}
}