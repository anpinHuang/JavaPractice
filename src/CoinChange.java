

public class CoinChange {
	public static int coinChange(int n, int[] coins, int StartCoinIndex) {
		// find all the coin combinations to achieve $n with recursion
		int Comb = 0;
		for(int i_coin=StartCoinIndex;i_coin<=(coins.length-1);i_coin++) {
			int remain = n - coins[i_coin];
			//System.out.println(remain);
			if(remain==0) {
				Comb = Comb + 1;
			} else if (remain < 0){
				// do nothing
			} else {
				Comb = Comb + coinChange(remain,coins,i_coin);
			}
		}
		return Comb;
	}
}

