import java.io.*;
class Demo{
	public static void main(String[]Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size of array :");
		int size = Integer.parseInt(br.readLine());
		int EvenCount =0;
		int OddCount =0;

		int arr[] = new int[size];

		System.out.println("Enter the elements of array:");
                for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				EvenCount++;
			}else{
				OddCount++;
			}
		}System.out.println("Even Count :"+EvenCount);
		System.out.println("Odd Count :"+OddCount);
	}
}

