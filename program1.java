import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size of the array:");
		int size=Integer.parseInt(br.readLine());
		int sum=0;

		int arr[] =new int[size];
		System.out.println("Enter the Elements of Array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}System.out.println(sum);
	}
}
