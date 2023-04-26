import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array:");
		int size =Integer.parseInt(br.readLine());

		int arr[]=new int [size];
		System.out.println("Enter the values of arrays:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}System.out.println("Maximum Element is :"+max);
	}
}
