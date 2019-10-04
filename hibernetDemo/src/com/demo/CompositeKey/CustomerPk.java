package com.demo.CompositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer_table")
@Embeddable
public class CustomerPk implements Serializable {


   private int id;
	private String regno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public CustomerPk(int id, String regno) {
		super();
		this.id = id;
		this.regno = regno;
	}
	public CustomerPk() {
		
	}
	@Override
	public String toString() {
		return "CustomerPk [id=" + id + ", regno=" + regno + "]";
	}

	
}
