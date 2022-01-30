
class Matrix_multi
{
public static void main(String args[])
{
int rows =3;
int col =3;
int A[][]={{1,1,0},{0,1,1},{1,2,3}};
int B[][]={{0,1,2},{1,3,2},{5,5,5}};
int multi[][]=new int[rows][col];
System.out.println("After Multiplication: ");
for(int i=0; i<rows; i++)
{
for(int j=0; j<col;j++)
{
multi[i][j]= A[i][j]*B[i][j];
System.out.printf("Element %d%d is %d",(i+1),(j+1),multi[i][j]);
System.out.println(" ");
}
}
}
}
