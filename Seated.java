package application;

/*
Student's Name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lab's Section : 6 
Instructor's Name : Bassem Sayrafi
*/
public class Seated extends PizzaOrder{
	// since the attributes don't have setters and getters that means they are by default NOT private as shown below
	double serviceCharge;
	int numberOfPeople;
	public Seated (){}//constructor
	public Seated(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice,double serviceCharge,int numberOfPeople) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.serviceCharge = serviceCharge;//to edit for this object ((the one i am using it at this time))
		this.numberOfPeople = numberOfPeople;
	}
	@Override
	public String toString() {//it's overriden method since the same name and signature are the same
		return super.toString() + "Seated [serviceCharge=" + serviceCharge + ", numberOfPeople=" + numberOfPeople + "]";
	}
	 @Override
	    public double calculateOrderPrice()
	    {//it's overriden method since the same name and signature are the same
		   double z = super.calculateOrderPrice();
		   double n = z + ( serviceCharge * numberOfPeople);//as the demanded func
		   return n;
	    }
	 @Override
		public int compareTo(PizzaOrder o) {//the comp interface
			if (calculateOrderPrice() > o.calculateOrderPrice())//comparing the present value with other values
				return 1;
			else if (calculateOrderPrice() == o.calculateOrderPrice())
			return 0;
			else
				return -1;
		}
}
