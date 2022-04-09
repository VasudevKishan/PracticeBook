package junitTest;

public class HelloWorld {
	String say() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		System.out.println(new HelloWorld().say());
	}
}
