package overriding;

public class Sbi extends Rbi {
	public float getRateofInterest(){
		System.out.println(super.getRateofInterest());//super class method
		return 5.5f;
	}
}
