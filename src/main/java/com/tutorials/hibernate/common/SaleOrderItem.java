package com.tutorials.hibernate.common;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sale_order_item")
public class SaleOrderItem extends UUIDEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6933691663773381182L;
	
	@ManyToOne
	@JoinColumn(name = "order_id", foreignKey = @ForeignKey(name = "sale_order_item_order_id"))
    private SaleOrder order;
	
	private BigDecimal price;
	
	public SaleOrderItem() {
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public SaleOrder getOrder() {
		return order;
	}

	public void setOrder(SaleOrder order) {
		this.order = order;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", order=" + order + ", price=" + price + "]";
	}
		
}
