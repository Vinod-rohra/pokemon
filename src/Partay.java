import java.util.Scanner;

public class Partay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Pokemon 1:");
		String pokemon1 = scan.nextLine();
		
		System.out.println("Enter Pokemon 2:");
		String pokemon2 = scan.nextLine();
	
		
		System.out.println("poke1:" + pokemon1);
		
		System.out.println("poke2:" + pokemon2);
		
		User u1 = new User("vinod");
		
		User u2 = new User("vinod");
		
		System.out.println(u1.toString());
		
		if(u1.equals(u2)) 
			System.out.println("objects are equal");
		
	}

}
