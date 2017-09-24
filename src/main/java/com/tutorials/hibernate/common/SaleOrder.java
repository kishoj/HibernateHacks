package com.tutorials.hibernate.common;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sale_order")
public class SaleOrder extends UUIDEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4660286407628416650L;

	private String reference;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", foreignKey = @ForeignKey(name = "fk_sale_order_customer_id"))
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_sale_order_product_id"))
	private Product product;
	
	private String currency;
	
	private LocalDateTime orderDate;
	
	private BigDecimal totalPrice;
	
	@OneToMany(mappedBy = "order")
    private List<SaleOrderItem> items = new ArrayList<SaleOrderItem>();
    
	public SaleOrder() {
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<SaleOrderItem> getItems() {
		return items;
	}

	public void setItems(List<SaleOrderItem> items) {
		this.items = items;
	}
	
	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "SaleOrder [id=" + id + ", reference=" + reference + ", customer=" + customer + ", currency=" + currency
				+ ", orderDate=" + orderDate + ", totalPrice=" + totalPrice + ", items=" + items + "]";
	}
		
}
