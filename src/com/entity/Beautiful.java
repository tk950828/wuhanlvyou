package com.entity;

public class Beautiful {
	private String id;
	private String name;
	private String price;
	private String location;
	private String description;
	private String img;
	private String types;
	
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	
	public Beautiful(String id,String name,String price,String location,String description,String img,String types){
		this.id=id;
		this.name=name;
		this.price=price;
		this.location=location;
		this.description=description;
		this.img=img;
		this.types=types;
	}
}
