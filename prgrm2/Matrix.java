import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("No. of Rows:");
int m=sc.nextInt();
System.out.print("No. of Columns:");
int n=sc.nextInt();
int[][] mat1=new int[m][n];
int[][] mat2=new int[m][n];
int[][] SumMat=new int[m][n];
System.out.println("First matrix:");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
mat1[i][j]=sc.nextInt();
}
}
System.out.println("second matrix:");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
mat2[i][j]=sc.nextInt();
}
}
System.out.println("Resultant matrix:");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
SumMat[i][j]=mat1[i][j]+mat2[i][j];
System.out.print(SumMat[i][j]+"\t");
}
System.out.println();
}
}
}
