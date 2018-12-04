package com.qa.persistence.domain;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class BabyName {
	
	public ObjectId _id;
	private String name;
	
	public BabyName() {
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BabyName [_id=" + _id + ", name=" + name + "]";
	}
	
	

}
