package Section4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class test2_1 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char arr[] = str.toCharArray();
		str = br.readLine();
		char arr1[] = str.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
		}
		
		String answer = "YES";
		for(char a : arr1) {
			if(!hashmap.containsKey(a) || hashmap.get(a) == 0) {
				System.out.println("NO");
				return;
			}
			hashmap.put(a, hashmap.get(a) - 1);
		}
		System.out.println(answer);
	}
}
