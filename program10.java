import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size of array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter the array Elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int sum =0;
			while(num!=0){		
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}if(sum%2==0){
				System.out.println(arr[i]);
			}
		}
	}
}


