package com.manytomanyunidirectional;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CART")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Cart_Id")
	private int id;
	@Column(name = "Cart_Total")
	private double total;
	
	@ManyToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
	@JoinTable(name = "Main_CART_ITEM",
	joinColumns = {@JoinColumn(name = "Item_Id")},
	inverseJoinColumns ={@JoinColumn(name = "Cart_Id")})
	private Set<Item> item;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}
	
	
}
