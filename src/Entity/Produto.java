package Entity;

public class Produto {
private String Name;
private double Price;
private int Quantity;

public Produto(String name, double price, int quantity) {
	Name = name;
	Price = price;
	Quantity = quantity;
}
public Produto() {
	
}
public String getName() {
	return this.Name;
}
public void setName(String name) {
	this.Name = name;
}
public double getPrice() {
	return this.Price;
}
public void setPrice(double price) {
	this.Price = price;
}
public int getQuantity() {
	return Quantity;
}
public void addProductQuantity(int quantity) {
	this.Quantity = this.Quantity + quantity;
}
public void removeProductQuantity(int quantity) {
	this.Quantity = this.Quantity - quantity;
}
public double priceTotal() {
	double TotalPrice=0;
	TotalPrice= this.Quantity*this.Price;
	return TotalPrice;
}
@Override
public String toString() {
	return "Produto [Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity + "]";
}


}
