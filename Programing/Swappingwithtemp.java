class Swappingwithtemp{
	public static void main(String[]args){
	
		int a = 5;
		int b = 6;

		System.out.println("Before Swapping: ");
		System.out.println(a);
		System.out.println(b);


		int temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping: ");
		System.out.println(a);
		System.out.println(b);
   
	
	}

}