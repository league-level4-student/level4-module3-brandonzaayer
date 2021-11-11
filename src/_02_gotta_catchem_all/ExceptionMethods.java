package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException{
		double c = a/b;
		if(b == 0.0) {
			throw new IllegalArgumentException();
		}
		return c;
	}
	public String reverseString(String s) throws IllegalStateException{
		String backwards = "";
		if(s.length()==0) {
			throw new IllegalStateException();
		}
		else {
			for(int i = s.length()-1; i >= 0; i--){
			backwards = backwards + s.charAt(i);
			}
		}
		System.out.println(s + "\n" + backwards);
		return backwards;
	}
}
