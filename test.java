import java.util.Random;
import java.util.Scanner;
import java.lang.*;


public class test {
	public static void main(String[] args) {
	String name = "";
	System.out.println("Enter your name");
	Scanner input = new Scanner(System.in);
	name = input.nextLine();
	generateRandomNumber(name);

}
public static void generateRandomNumber(String name)
{
	Random r = new Random();
	int n =  r.nextInt((15 - 6) + 1) + 6;
	System.out.println(name+ " "+n);
}
}