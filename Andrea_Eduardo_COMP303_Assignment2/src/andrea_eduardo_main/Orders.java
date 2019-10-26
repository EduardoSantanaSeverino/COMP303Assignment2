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
	
	@Id  
	@GeneratedValue
	private int orderId;
	private int customerId;
	private int productId;
	private String orderDate;
	private String color;
	private String comments;
	private String status;
	private int amountPaid;
	private String credictCardNumber;
	private String credictCardExpDate;
	private String credictCardCode;
	private String credictCardName;
	
	private static final long serialVersionUID = 1L;

	public Orders() {
		super();
	}   
	
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
	public String getCredictCardName() {
		return this.credictCardName;
	}

	public void setCredictCardName(String creadictCardName) {
		this.credictCardName = creadictCardName;
	}
   
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @param customerId
	 * @param productId
	 * @param orderDate
	 * @param color
	 * @param comments
	 * @param status
	 * @param amountPaid
	 * @param credictCardNumber
	 * @param credictCardExpDate
	 * @param credictCardCode
	 * @param credictCardName
	 */
	public Orders(int customerId, 
			int productId, 
			String orderDate, 
			String color, 
			String comments, 
			String status,
			int amountPaid, 
			String credictCardNumber, 
			String credictCardExpDate, 
			String credictCardCode,
			String credictCardName) {
		super();
		this.customerId = customerId;
		this.productId = productId;
		this.orderDate = orderDate;
		this.color = color;
		this.comments = comments;
		this.status = "Created";
		this.amountPaid = amountPaid;
		this.credictCardNumber = credictCardNumber;
		this.credictCardExpDate = credictCardExpDate;
		this.credictCardCode = credictCardCode;
		this.credictCardName = credictCardName;
	}
	
	
}
