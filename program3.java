import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the size of array:");
		int size =Integer.parseInt(br.readLine());
		int sum1 =0;
		int sum2=0;

		System.out.println("Enter the values for array:");
		int arr[]=new int [size];
		for(int i =0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				sum2=sum2+arr[i];
			}else{
				sum1=sum1+arr[i];
			}
		}System.out.println("Even Numbers addition :"+sum2);
		System.out.println("Odd Nimbers Addition :"+sum1);
	}
}
