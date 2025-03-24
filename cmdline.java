class cmdline{
	public static void main(String [] args){
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int a,b,c,d;
		a = m + n;
		b = m - n;
		c = m * n;
		d = m / n;
		System.out.println("Addition: " + a);
		System.out.println("Subtraction: " + b);
		System.out.println("Multiplication: " + c);
		System.out.println("Division: " + d);
	}
}
