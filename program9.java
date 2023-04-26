import java.io.*;
class Demo{
	public static void main(String[] Shreya)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr1[]={10,20,30,40,50};
		int arr2[]={9,18,27,36,45};
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			arr3[arr1.length+i]=arr2[i];
		}System.out.print("[");
		for(int i=0;i<arr3.length;i++){
			System.out.print(" "+arr3[i]);
		}System.out.print("]");
	}
}	
