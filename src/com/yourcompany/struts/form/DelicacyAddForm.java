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
 * @struts.form name="delicacyAddForm"
 */
public class DelicacyAddForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** id property */
	private String id;

	/** price property */
	private String price;

	/** location property */
	private String location;

	/** description property */
	private String description;

	/** name property */
	private String name;

	/** img property */
	private String img;

	/** types property */
	private String types;

	/** user property */
	private String user;

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
	 * Returns the price.
	 * @return String
	 */
	public String getPrice() {
		return price;
	}

	/** 
	 * Set the price.
	 * @param price The price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/** 
	 * Returns the location.
	 * @return String
	 */
	public String getLocation() {
		return location;
	}

	/** 
	 * Set the location.
	 * @param location The location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/** 
	 * Returns the description.
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/** 
	 * Set the description.
	 * @param description The description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/** 
	 * Returns the name.
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/** 
	 * Set the name.
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * Returns the img.
	 * @return String
	 */
	public String getImg() {
		return img;
	}

	/** 
	 * Set the img.
	 * @param img The img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/** 
	 * Returns the types.
	 * @return String
	 */
	public String getTypes() {
		return types;
	}

	/** 
	 * Set the types.
	 * @param types The types to set
	 */
	public void setTypes(String types) {
		this.types = types;
	}

	/** 
	 * Returns the user.
	 * @return String
	 */
	public String getUser() {
		return user;
	}

	/** 
	 * Set the user.
	 * @param user The user to set
	 */
	public void setUser(String user) {
		this.user = user;
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