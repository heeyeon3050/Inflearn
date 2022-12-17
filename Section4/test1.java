package Section4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class test1 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char arr[] = new char[N];
		
		String str = br.readLine();
		arr = str.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
		}
		
		char answer = ' ';
		int max = Integer.MIN_VALUE;
		for(char key : hashmap.keySet()) {
			if(hashmap.get(key) > max) {
				max = hashmap.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
