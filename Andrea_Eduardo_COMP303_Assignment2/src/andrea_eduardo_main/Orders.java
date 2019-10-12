package andrea_eduardo_main;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Orders
 *
 */
/**
 * Students Names and Id's
 * Andrea de la Isla - 
 * Eduardo Santana - 301048660
 */
@Entity
public class Orders implements Serializable {
	
	private int orderId;
	private int customerId;
	private int productId;
	private String orderDate;
	private String status;
	private int amountPaid;
	private String credictCardNumber;
	private String credictCardExpDate;
	private String credictCardCode;
	private String creadictCardName;
	private static final long serialVersionUID = 1L;

	public Orders() {
		super();
	}   
	
	@Id    
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}   
	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}   
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}   
	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}   
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}   
	public int getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}   
	public String getCredictCardNumber() {
		return this.credictCardNumber;
	}

	public void setCredictCardNumber(String credictCardNumber) {
		this.credictCardNumber = credictCardNumber;
	}   
	public String getCredictCardExpDate() {
		return this.credictCardExpDate;
	}

	public void setCredictCardExpDate(String credictCardExpDate) {
		this.credictCardExpDate = credictCardExpDate;
	}   
	public String getCredictCardCode() {
		return this.credictCardCode;
	}

	public void setCredictCardCode(String credictCardCode) {
		this.credictCardCode = credictCardCode;
	}   
	public String getCreadictCardName() {
		return this.creadictCardName;
	}

	public void setCreadictCardName(String creadictCardName) {
		this.creadictCardName = creadictCardName;
	}
   
}
