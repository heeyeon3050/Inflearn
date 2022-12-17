package Section4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class test2 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char arr[] = str.toCharArray();
		str = br.readLine();
		char arr1[] = str.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		HashMap<Character, Integer> hashmap1 = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
			hashmap1.put(arr1[i], hashmap1.getOrDefault(arr1[i], 0) + 1);
		}
		
		
		boolean flag = true;
		for(char key : hashmap.keySet()) {
			if(!hashmap1.containsKey(key)) {
				flag = false;
				break;
			}
			
			else if(hashmap.get(key) != hashmap1.get(key)) {
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
