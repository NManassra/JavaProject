package application;

/*
Student's Name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lab's Section : 6 
Instructor's Name : Bassem Sayrafi
*/
public  class ToGo extends PizzaOrder{
	public ToGo() {//constructor
		super();
		// TODO Auto-generated constructor stub
	}

	public ToGo(String customerName, int numberOfToppings, double toppingPrice, int pizzaSize) {//constructor
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		// TODO Auto-generated constructor stub
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
