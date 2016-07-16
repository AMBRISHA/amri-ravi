package programs;

public class Calc1 {
	 void sum(int a,int b){
			System.out.println(a+b );
		}
		 void sum(double a,double b){
			System.out.println(a+b);
		}
		public static void main(String[] args) {
			Calc1 c1= new Calc1();
			c1.sum(20, 30);
			c1.sum(40.5,40.5);
		}


}
