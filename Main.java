import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter a number:");
        int numInt = input.nextInt();
        
        System.out.println("Please enter another number:");
        int anotherInt = input.nextInt();
        
        System.out.println(numInt+anotherInt);
        System.out.println("Multiply the sum with another number:");
        int newInt = input.nextInt();
        
        System.out.println("The final result is:");
        System.out.println((numInt+anotherInt)*newInt);
        
	}

}
