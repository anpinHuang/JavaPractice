import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] InputArray = {2,3,7,11};
		int a = CoinChange.coinChange(88,InputArray,0);
		System.out.println(a);
		HashMap<String, Integer> InitialHashMap = new HashMap<String, Integer>();
		int b = CoinChangeDP.coinChangeDP(88,InputArray,0, InitialHashMap);
		System.out.println(b);
	}

}
