import java.util.*;
class Petrol 
{
	float price = 105;
	float amount, quantity;
	protected void setPrice(float p) 
	{
		price=p;
	}
	protected void getPrice( ) 
	{
		System.out.println("Petrol price = "+price);
	}
	Petrol ()
	{ 
		//constructor
		amount = 0;
		quantity =0;
		System.out.println("Amount =" +amount);
		System.out.println("Quantity ="+quantity);
	}
	public void enterAmount()
	{
		System.out.println("Enter amount > 10:\n");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextFloat();
		quantity = amount / price;
		System.out.printf("Quantity dispensed: %.3f%n Pay: %.2f", quantity, amount);
		//calculation
	}
	public void enterQuantity()
	{
		System.out.println("Enter quantity in litres:\n");
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextFloat();
		amount = quantity * price;
		System.out.printf("Quantity dispensed: %.3f%n Pay: %.2f", quantity, amount);
		//calculation
	}
}
class PetrolPump {
	public static void main(String[] args)
	 {
		// TODO Auto-generated method stub
		String choice;
		Petrol p1 = new Petrol();
               //p1.setPrice(75);
		p1.getPrice();
                System.out.println("\nEnter for Petrol :  Enter Quantity or Amount. enter q or a\n");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();
		switch(choice)
                { //use switch case
                        case "q":
			p1.enterQuantity();
			break;
			case "a":
			p1.enterAmount();
			break;
			default:System.out.println("Invalid choice");
		}
		System.out.println("\nThanks for Coming");
	}
}


//Vipul Mandloi
//20BCE10624 