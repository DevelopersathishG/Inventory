package com.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
	private String product_name;
	private String product_description;
	private String category;
	private Long product_stock;
	private Integer Cost_price;
	private Integer Selling_price;
	private Integer Tax;
	private Integer Discount;
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(Long product_stock) {
		this.product_stock = product_stock;
	}
	public Integer getCost_price() {
		return Cost_price;
	}
	public void setCost_price(Integer cost_price) {
		Cost_price = cost_price;
	}
	public Integer getSelling_price() {
		return Selling_price;
	}
	public void setSelling_price(Integer selling_price) {
		Selling_price = selling_price;
	}
	public Integer getTax() {
		return Tax;
	}
	public void setTax(Integer tax) {
		Tax = tax;
	}
	public Integer getDiscount() {
		return Discount;
	}
	public void setDiscount(Integer discount) {
		Discount = discount;
	}


}
