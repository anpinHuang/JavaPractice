
import java.util.HashMap;
public class CoinChangeDP {
	public static int coinChangeDP(int n, int[] coins, int StartCoinIndex, HashMap<String, Integer>  temp) {
		// find all the coin combinations to achieve $n with recursion
		int Comb = 0;
		String tempKey = n + "-" + StartCoinIndex;
		for(int i_coin=StartCoinIndex;i_coin<=(coins.length-1);i_coin++) {
			if(temp.containsKey(tempKey)) {
				return temp.get(tempKey);
			}
			int remain = n - coins[i_coin];
			//System.out.println(remain);
			if(remain==0) {				
				Comb = Comb + 1;
			} else if (remain < 0) {
				// do nothing
			} else {
				Comb = Comb + coinChangeDP(remain,coins,i_coin,temp);
			}
		}
		temp.put(tempKey, Comb);
		return Comb;
	}
}
