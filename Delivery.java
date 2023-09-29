package application;

/*
Student's Name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lab's Section : 6 
Instructor's Name : Bassem Sayrafi
*/
import java.util.*;
public class Delivery extends PizzaOrder {
	// since the attributes do have setters and getters that means they are private as shown below
	private double tripRate;
	private int zone;
	public Delivery() {
	}//constructor
	public Delivery(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice,double tripRate, int zone) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.tripRate = tripRate;
		this.zone = zone;
	}
	public double getTripRate() {//getters using source..generator
		return tripRate;
	}
	public void setTripRate(double tripRate) {//setters using source..generator
		this.tripRate = tripRate;
	}
	public int getZone() {//getters using source..generator
		return zone;
	}
	public void setZone(int zone) {//setters using source..generator
		while (zone > 4 || zone < 1)
		{
			System.out.println("The zone SUPPOSED TO BE BETWEEN 1-4 ONLY !!!!");
		}	
		this.zone = zone;
	}

	@Override
	public String toString() {//it's overriden method since the same name and signature are the same
		return super.toString() + "Trip Rate = " + (int)tripRate + "\n\nZone = " + zone ;
	}

    @Override
    public double calculateOrderPrice()
    {//it's overriden method since the same name and signature are the same
	   double z = super.calculateOrderPrice();
	   double n = z + ( tripRate/100 * z * zone );
	   return n;
    }
    @Override
	public int compareTo(PizzaOrder o) {//it's overriden method since the same name and signature are the same
		if (calculateOrderPrice() > o.calculateOrderPrice())
			return 1;
		else if (calculateOrderPrice() == o.calculateOrderPrice())
		return 0;
		else
			return -1;
	}

}
