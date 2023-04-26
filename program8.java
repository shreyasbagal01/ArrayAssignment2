import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size of array :");
		int size=Integer.parseInt(br.readLine());
		int arr1[]=new int [size];
		int arr2[]=new int [size];
		System.out.println("Enter the elements of Array :");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the elements of Array 2:");
		for(int j =0;j<arr2.length;j++){
			arr2[j]=Integer.parseInt(br.readLine());
		}	

		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]!=arr2[j]){
					System.out.print(arr1[i]);
				}
			}
		}
	}
}
