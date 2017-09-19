package NLab3;

public class Person {
	static int current_year = 2017;
	private String name;
	private int birthdate;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.birthdate = bdate;
	}

	//Sets birthdate to the input year
	public void reset_birthday(int year){
		birthdate = year;
	}
	
	//Prints the person's name
	public void display_name(){
		System.out.println("This is " + name);
	}
	
	//Prints the person's birthdate
	public void display_birthday(){
		System.out.printf("I was born in %d. ",birthdate);
	}
	
	//Calculates the person's age and prints it out
	public void display_age(){
		age = current_year - birthdate;
		print_age(age);
	}

	//Prints out the age of the person and whether they are a senior citizen or not
	public void print_age(int age) {
		System.out.printf("I am %d years old ",age);
		
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	
	//Calls on each of the display methods and has them print their information
	public void display_all() {
		display_name();
		display_birthday();
		display_age();
	}
	
	//Main method that displays a person's information
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.display_all();		
	}

}
