package Section6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test4 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int cache[] = new int[S];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			int pos = -1;
			for(int j=0; j<S; j++) {
				if(arr[i] == cache[j])
					pos = j;
			}
			
			if(pos == -1) {
				for(int j=S-1; j>=1; j--) {
					cache[j] = cache[j-1];
				}
			}
			
			else {
				for(int j=pos; j>=1; j--) {
					cache[j] = cache[j-1];
				}
			}
			cache[0] = arr[i];
		}
		
		for(int i=0; i<S; i++)
			System.out.print(cache[i] + " ");
	}
}
