package Section6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//선택 정렬
public class test1 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N-1; i++) {
			int idx = i;
			for(int j=i+1; j<N; j++) {
				if(arr[j] < arr[idx]) 
					idx = j;
			}
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		for(int i=0; i<N; i++)
			System.out.print(arr[i] + " ");
	}
}
