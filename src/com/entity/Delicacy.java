package com.entity;

public class Delicacy {
	private String id;
	private String name;
	private String img;
	private String price;
	private String type;
	private String location;
	private String description;

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Delicacy (String id,String name,String img,String price,String type,String location,String description){
		this.id = id;
		this.name = name;
		this.img = img;	
		this.price=price;
		this.type=type;
		this.location=location;
		this.description=description;
	}

}
