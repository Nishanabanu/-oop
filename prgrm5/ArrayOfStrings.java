import java.util.Scanner;
import java.util.Arrays;
class ArrayOfStrings
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of strings:");
	int size=sc.nextInt();
	String[] strings=new String[size];
	System.out.println("Enter the Strings:");
	for(int i=0; i<size; i++){
	strings[i]=sc.next();
	}
	System.out.println("\n1.Built-in method \n2.User defined method: ");
	System.out.print("\noption:");
	int opt=sc.nextInt();
	switch(opt){
	case 1: //built in method
		Arrays.sort(strings);
		break;
	case 2: //user defined method
		String temp;
		for(int i=0;i<size-1;i++){
		for(int j=i+1;j<size;j++){
		if(strings[i].compareTo(strings[j])>0){
		temp=strings[i];
		strings[i]=strings[j];
		strings[j]=temp;
		}
		}
		}
		break;
		default:
			System.out.println("Invalid:");	
			break;
		}
		for(int i=0;i<size;i++){
		System.out.println(strings[i]);
	}	
}
}	
	
