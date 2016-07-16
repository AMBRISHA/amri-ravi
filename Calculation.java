package programs;

 class Calculation {
	 void sum(int a,int b){
		System.out.println(a+b );
	}
	 void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Calculation c1= new Calculation();
		c1.sum(20, 30);
		c1.sum(20, 20,20);
	}

	
}
