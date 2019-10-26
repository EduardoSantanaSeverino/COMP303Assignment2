package andrea_eduardo_main;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Products
 *
 */
/**
 * Students Names and Id's
 * Andrea de la Isla - 
 * Eduardo Santana - 301048660
 */
@Entity
public class Products implements Serializable {

	/**
	 * @param productId
	 * @param productName
	 * @param price
	 * @param quantity
	 * @param category
	 */
	public Products(String productName, int price, int quantity, String category) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	@Id  
	@GeneratedValue
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	private String category;
	private static final long serialVersionUID = 1L;

	public Products() {
		super();
	}   
  
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}   
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}   
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}   

   
}
