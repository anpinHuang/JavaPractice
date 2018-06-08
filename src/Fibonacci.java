import java.util.HashMap;

public class Fibonacci {
	public static HashMap<Long,Long> temp = new HashMap<>();
	public static long fibonacci(long n) {
		if(temp.containsKey(n)) {
			return temp.get(n);
		}
		if(n==0) {
			temp.put(n,n);
			return n;
		} else if(n<=2) {
			long One = 1;
			temp.put(n,One);
			return One;
		} else {
			long r = fibonacci(n-1)+fibonacci(n-2);
			if(temp.containsKey(n)) {
				temp.put(n,r);
			}
			return r;
		}
	
	}
}
