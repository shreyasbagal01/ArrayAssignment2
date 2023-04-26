import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array :");
		int size =Integer.parseInt(br.readLine());

		System.out.println("Enter the values of array:");
		int arr[]=new int [size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int min= arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
				System.out.print(min);
			}
		}
	}
}
			
