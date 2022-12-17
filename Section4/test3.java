package Section4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class test3 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		for(int i=0; i<K-1; i++) {
			hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
		}
		
		int lt = 0;
		for(int rt=K-1; rt<N; rt++) {
			hashmap.put(arr[rt], hashmap.getOrDefault(arr[rt], 0) + 1);
			sb.append(hashmap.size() + " ");
			hashmap.put(arr[lt], hashmap.get(arr[lt]) -1);
			if(hashmap.get(arr[lt]) == 0)
				hashmap.remove(arr[lt]);
			lt++;
		}
		
		System.out.println(sb);
	}
}
