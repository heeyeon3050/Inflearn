package Section4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class test4 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char S[] = str.toCharArray();
		str = br.readLine();
		char T[] = str.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		HashMap<Character, Integer> hashmap1 = new HashMap<>();
		
		for(int i=0; i<T.length; i++) {
			hashmap1.put(T[i], hashmap1.getOrDefault(T[i], 0) +1);
		}
		
		for(int i=0; i<T.length-1; i++) {
			hashmap.put(S[i], hashmap.getOrDefault(S[i], 0) +1);
		}
		
		int lt = 0;
		int cnt = 0;
		for(int rt=T.length-1; rt<S.length; rt++) {
			hashmap.put(S[rt], hashmap.getOrDefault(S[rt], 0) +1);
			if(hashmap.equals(hashmap1)) {
				cnt++;
			}
			hashmap.put(S[lt], hashmap.get(S[lt])-1);
			if(hashmap.get(S[lt]) == 0)
				hashmap.remove(S[lt]);
			lt++;
		}
		
		System.out.println(cnt);
	}
}
