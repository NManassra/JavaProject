package application;
/*
Student's Name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lab's Section : 6 
Instructor's Name : Bassem Sayrafi
*/
import java.util.*;
public class PizzaOrder implements Comparable<PizzaOrder> {
	// since the attributes do have setters and getters that means they are private as shown below
	private String customerName;
	private Date dateOrdered;
	private int pizzaSize;
	private int numberOfToppings;
	private double toppingPrice;
	final static int SMALL =1;//IT'S FINAL SO IT'S IMPOSSIBLE TO CHANGE!
	final static int MEDIUM =2;//IT'S FINAL SO IT'S IMPOSSIBLE TO CHANGE!
	final static int LARGE =3;//IT'S FINAL SO IT'S IMPOSSIBLE TO CHANGE!
    
	PizzaOrder(){dateOrdered = new Date(); }//constructor which having the date to save it at the time i press the run button
	
	public double calculateOrderPrice()
	{//func is given
		double x = ( numberOfToppings * toppingPrice ) * pizzaSize;
		return x;
	}

	public void printOrderInfo ()
	{//method as given
		System.out.println("The customer's name is : " + this.customerName + " and the calculated order price is : " + (int)this.calculateOrderPrice()+"\n");
	}
	public PizzaOrder(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {//constructor as the order demanded 
	super();
	this.customerName = customerName;
	dateOrdered = new Date();
	this.numberOfToppings = numberOfToppings;
	this.toppingPrice = toppingPrice;
	this.pizzaSize = pizzaSize;
}
	@Override
	public String toString() {//it's overriden method since the same name and signature are the same
		if (pizzaSize == 1)//i put this condtion cuz the needed is the status of the pizza size not as number but as a word and here 1 = small
		return "Customer Name = " + customerName + "\n\nDate Ordered = " + dateOrdered + "\n\nPizza Size = small" 
		+ "\n\nNumber of Toppings = " + numberOfToppings + "\n\nTopping Price = " + (int)toppingPrice + "\n\n";
		else if (pizzaSize == 2)//2=medium
			return "Customer Name = " + customerName + "\n\nDate Ordered = " + dateOrdered + "\n\nPizza Size = medium" 
			+ "\n\nNumber of Toppings = " + numberOfToppings + "\n\nTopping Price = " + (int)toppingPrice + "\n\n";
		else if (pizzaSize == 3)//3=large
			return "Customer Name = " + customerName + "\n\nDate Ordered = " + dateOrdered + "\n\nPizza Size = large" 
			+ "\n\nNumber of Toppings = " + numberOfToppings + "\n\nTopping Price = " + (int)toppingPrice + "\n\n";
		else
			return "Customer Name = " + customerName + "\n\nDate Ordered = " + dateOrdered + "\n\nPizza Size = "+ pizzaSize 
			+ "\n\nNumber of Toppings = " + numberOfToppings + "\n\nTopping Price = " + (int)toppingPrice +"\n\n";
			
	}
	public String getCustomerName() {//getters using source..generator
		return customerName;
	}
	public void setCustomerName(String customerName) {//setters using source..generator
		this.customerName = customerName;
	}
	public Date getDateOrdered() {//getters using source..generator
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered) {//setters using source..generator
		this.dateOrdered = dateOrdered;
	}
	public int getPizzaSize() {//getters using source..generator
		return pizzaSize;
	}
	public void setPizzaSize(int pizzaSize) {//setters using source..generator
		this.pizzaSize = pizzaSize;
	}
	public int getNumberOfToppings() {//getters using source..generator
		return numberOfToppings;
	}
	public void setNumberOfToppings(int numberOfToppings) {//setters using source..generator
		this.numberOfToppings = numberOfToppings;
	}
	public double getToppingPrice() {//getters using source..generator
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) {//setters using source..generator
		this.toppingPrice = toppingPrice;
	}

	@Override//it's overriden method since the same name and signature are the same
	public int compareTo(PizzaOrder o) {//the comp interface
		if (calculateOrderPrice() > o.calculateOrderPrice())//comparing the present value with other values
			return 1;
		else if (calculateOrderPrice() == o.calculateOrderPrice())
		return 0;
		else
			return -1;
	}

}
