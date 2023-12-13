package package1;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task obj1 = new Task();
		obj1.sum();
		obj1.even();
		obj1.alphabet();
		obj1.swap();
		obj1.prime();
		obj1.factorial();
		obj1.len();
		obj1.repeat();
		obj1.senior();
		obj1.digit();

	}

	public void sum() {
		// Java program to find sum of a and b is greater than c and d starts here
		int a = 10;
		int b = 10;
		int c = 5;
		int d = 5;
		int x = a + b;
		int y = c + d;
		if (x > y) {
			System.out.println("Sum of a and b is " + x + " greater than c and d");
		} else {
			System.out.println("Sum of c and d is " + y + " greater than a and b");
		}
		// Java program to find sum of a and b is greater than c and d ends here

	}

	public void even() {
		// Java program to find even number starts here
		int a = 10;
		int x = a % 2;
		if (x == 0) {
			System.out.println("a  is a even number ");
		} else {
			System.out.println("a  is not an even number ");
		}
		// Java program to find even number starts here
	}

	public void alphabet() {
		// Java program to print alphabet A to Z starts here
		char c;
		for (c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		// Java program to print alphabet A to Z starts here
	}

	public void swap() {
		// Java program to swap two variables starts here
		int a = 5;
		int b = 4;
		int x = a;
		int y = b;
		b = x;
		a = y;
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		// Java program to swap two variables starts here
	}

	public void prime() {
		// Java program to find a prime number starts here
		int num = 29;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		// Java program to find a prime number ends here
	}

	public void factorial() {
		// Java program to find a factorial number starts here
		int x = 10;
		long factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of a given number is: " + factorial + "!");
		// Java program to find a factorial number ends here
	}

	public void len() {
		// Java program to find a length starts here
		String msg = "Guvi Geek";
		int result = msg.length();
		System.out.println("The length of the string is " + result + ".");
		// Java program to find a length ends here
	}

	public void repeat() {
		// Java program to print string 10 times starts here
		String str = "Welcome to Guvi";
		for (int i = 1; i <= 10; i++) {
			System.out.println(str);
		}
		// Java program to print string 10 times ends here
	}

	public void senior() {
		// Java program to find senior citizen starts here
		int age = 50;
		if (age >= 60) {
			System.out.println("The person is a Senior Citizen");
		} else {
			System.out.println("The person is not a Senior Citizen");
		}
		// Java program to find senior citizen ends here
	}

	public void digit() {
		// Java program to count digits starts here
		int num = 105567893;
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println(count);
		// Java program to count digits ends here
	}

}
