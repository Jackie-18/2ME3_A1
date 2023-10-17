import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;


public class Menu {
	boolean exit; //starts false
	
	private List<Car> cars = new ArrayList<>();
	private List<Vacation> vacations = new ArrayList<>();

	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}
	
	public void runMenu() {
		printHeader();
		while(!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
		
	}

	private void printHeader() {
		System.out.println("+---------------------+");
		System.out.println("|   Welcome to our    |");
		System.out.println("|   Menu Applcation   |");
		System.out.println("+---------------------+");
	}
	
	public void printMenu(){
		System.out.println("\nPlease make a selection: ");
		System.out.println("1) Create new item");
		System.out.println("2) List items");
		System.out.println("3) Book a new item");
		System.out.println("4) Cancel a booking");
		System.out.println("5) List bookings");
		System.out.println("6) Show revenue");
		System.out.println("0) Exit");
	}
	
	private int getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1; //doesn't conflict with any menu options
		while(choice < 0 || choice > 6) {
			try {
				System.out.print("\nEnter your choice: ");
				choice = Integer.parseInt(kb.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid selection. Please try again.");
			}
		}
		return choice;
	}
	private void performAction(int choice) {
		switch(choice) {
			case 0:
				exit = true;
				System.out.println("Thank you for using our application.");
				break;
			case 1:
				createItem(); 
				break;
			case 2:
				listItems();
				break;
			case 3:
				bookItem(); 
				break;
			case 4:
				cancelBooking();
				break;
			case 5:
				listBookings(); 
				break;
			case 6:
				showRevenue();
				break;
			default:
				System.out.println("An unknown error has occured.");
		}
	}
	
	public void createItem() {
		Scanner kb = new Scanner(System.in);
        System.out.println("Select item type: ");
        System.out.println("1. Car");
        System.out.println("2. Vacation");
        int itemType = kb.nextInt();
        kb.nextLine();


        switch (itemType) {
            case 1:
                createCar(kb);
                break;
            case 2:
                createVacation(kb);
                break;
            default:
                System.out.println("Invalid item type.");
        }
    }

	private void createCar(Scanner scanner) {
        System.out.println("Enter license plate:");
        String licensePlate = scanner.nextLine();
        System.out.println("Enter year:");
        int year = numberchecker(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter make:");
        String make = scanner.nextLine();
        System.out.println("Enter number of doors:");
        int numDoors = scanner.nextInt();
        System.out.println("Enter price:");
        int price = scanner.nextInt();


        Car car = new Car(licensePlate, year, make, numDoors, price);
        cars.add(car);
        System.out.println("Car created successfully.");
	}
	
	private void createVacation(Scanner scanner) {
        System.out.println("Enter Country:");
        String country = scanner.nextLine();
        System.out.println("Enter city:");
        String city = scanner.nextLine();
        System.out.println("Enter season:");
        String season = scanner.nextLine();


        Vacation vacation = new Vacation(country, city, season);
        vacations.add(vacation);
        System.out.println("Vacation created successfully.");
	
	}
	
	private void listItems() {
		System.out.println("Listing cars...🥰");
		for (Car car : cars) {
			System.out.println("License plate: "+ car.getLicensePlate());
			System.out.println("Make: "+ car.getMake());
			System.out.println("Year: "+ car.getYear());
			System.out.println("Price: $"+ car.getPrice());
			
		}
		System.out.println("Listing vacation...");
		for (Vacation vacation : vacations) {
			System.out.println("Country: "+ vacation.getCountry());
			System.out.println("City: "+ vacation.getCity());
			System.out.println("Season: "+ vacation.getSeason());
			
		}
	}
	
	private void bookItem() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Client ID:");
        String userid = kb.nextLine();
        System.out.println("Start Date:");
        String fromDate = kb.nextLine();
        System.out.println("End Date:");
        String toDate = kb.nextLine();
        
        System.out.println("What kind of booking do you want?: ");
        System.out.println("1. Car");
        System.out.println("2. Vacation");
        System.out.println("3. Car and Vacation");
        int itemType = kb.nextInt();
        kb.nextLine();


        switch (itemType) {
            case 1:
                bookCar(kb);
                break;
            case 2:
                bookVacation(kb);
                break;
            case 3:
            	bookCar(kb);
            	bookVacation(kb);
                break;
            default:
                System.out.println("Invalid item type.");
        }
	}
	private void bookCar(Scanner scanner) {
		
	}
	private void bookVacation(Scanner scanner) {
		
	}
	
	private void cancelBooking() {
		System.out.println("Canceling booking...");
	}
	
	private void listBookings() {
		System.out.println("Listing bookings...");
	}
	
	private void showRevenue() {
		System.out.println("Showing revenue");
	}
	
	public static void numberchecker(int i) {
        try {
            int a = Integer.parseInt("1a");
            System.out.println(a);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
        System.out.println("Continuing execution...");
    }
	
}
	
