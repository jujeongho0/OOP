package Lab12_5;

public class PairTest {

	public static void main(String[] args) {
		
		Pair<Integer,String> pair1 = new Pair<Integer,String>();
		Pair<Integer,String> pair2 = new Pair<Integer,String>();
		Pair<Integer,String> pair3 = new Pair<Integer,String>();
		
		pair1.set(1,"First");
		pair2.set(2,"Second");
		pair3.set(3,"Third");
		
		System.out.printf("Original pair: ");
		pair1.get();
		
		System.out.printf("\n");
		
		System.out.printf("Modified pair: ");
		pair2.get();

	}


}
