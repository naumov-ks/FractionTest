package Main;

public class main {

	public static void main(String[] args) {
		Fraction f1=new Fraction(30,1);
		Fraction f2=new Fraction(1,10);
		System.out.println("f1 "+f1.toString());
		System.out.println("f2 "+f2.toString());
		Fraction res=f1.divide(f2);
		System.out.println("result "+res.toString());



	}

}
