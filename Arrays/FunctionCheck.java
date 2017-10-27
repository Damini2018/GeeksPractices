public class FunctionCheck{
	public static void main(String[] args) {
		int ar[]= {2,4,5,2,2,4,5};
		int ar2[]=new int[3];
		int ar3[]=ar;
		System.out.println("the ar2 is ");
		System.out.println("the ar2 size is "+ar2.length);
		for (int p :ar2 ) {
			System.out.print(p+"  ");
		}
		System.out.println();

		System.out.println("the ar3 is ");
		System.out.println("the ar3 size is "+ar3.length);
		for (int p :ar3 ) {
			System.out.print(p+"  ");
		}
		System.out.println();

		ar3=ar2;
		System.out.println("the ar3 is  after changing the size and element ");
		System.out.println("the ar3 size is "+ar3.length);
		for (int p :ar3 ) {
			System.out.print(p+"  ");
		}
		System.out.println();



		ar3=ar;
		System.out.println("the ar3 is  after changing the size and element ");
		System.out.println("the ar3 size is "+ar3.length);
		for (int p :ar3 ) {
			System.out.print(p+"  ");
		}
		System.out.println();


		ar=ar3;
		System.out.println("the ar is ");
		System.out.println("the ar size is "+ar.length);
		for (int p :ar ) {
			System.out.print(p+"  ");
		}
		System.out.println();

	}
}