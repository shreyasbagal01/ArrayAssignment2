import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array :");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter the elements of Array :");
		int arr[] =new int [size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the element to search:");
		int x =Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				System.out.println("index :"+i);
			}
		}
	}
}

