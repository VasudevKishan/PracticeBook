package src.bmi;

import java.util.Scanner;


class bmi{
	private float height;
	private float weight;
	
	float calculateBMI(float height,float weight) {
		if(height==0 || weight==0)
			return -1;
		
		return weight/(height*height);
		
	}
	float returnWeight(String str) {
		return Float.parseFloat( str.split("@")[0].replace("-", "."));
	}
	float returnHeight(String str) {
		return Float.parseFloat( str.split("@")[1].replace("-", "."));
	}
	String checkStatus(float bmi) {
		if(bmi>20 && bmi<24) {
			return "nourished";
		}
		else {
			return "malnourished";
		}
		
	}
}
public class source {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//System.out.println(new bmi().getBmi("68-45@1-78"));
		bmi b=new bmi();
		System.out.println(b.returnHeight("68-45@1-78"));
		System.out.println(b.returnWeight("68-45@1-78"));
		System.out.println(b.calculateBMI(b.returnHeight("68-45@1-78"), b.returnWeight("68-45@1-78")));
		System.out.println(b.checkStatus(b.calculateBMI(b.returnHeight("68-45@1-78"), b.returnWeight("68-45@1-78"))));
	}
}
/*
float res;
String weightString = a.split("@")[0];
String heightString = a.split("@")[1];

weight=Float.parseFloat( weightString.replace("-", "."));
height=Float.parseFloat(heightString.replace("-", "."));

*/