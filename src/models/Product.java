package models;

public class Product {
	
	/// Attributes
	
	private String brand;
	private String name;
	private double price;
	private int quantity;
    
	/// Constructor
	public Product(String brand, String name, double price, int quantity) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
    
    ///Methods/setters/getters
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	/*no olvides utilizar camelCase solo los 3
	 * 
	 *
	 * 
	 * 3 variables de cada clase: cliente/producto/receta/mesa
	 * 
	 * factura: total, valorservicio, rece
	 * */
    
}
