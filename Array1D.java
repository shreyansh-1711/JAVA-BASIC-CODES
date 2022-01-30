class Array1D
{
public static void main(String args[])
{
int[] num={12,27,163,44,655};
int n =num.length;
System.out.println("before sorting");
for(int i=0;i<n;i++)
{
System.out.println(num[i]);
}
for (int i=0 ;i<n;i++)
{
for (int j=i+i; j<n;j++)
{
if(num[i]<num[j])
{
int temp=num[i];
num[i]=num[j];
num[j]= temp;
}
}
}
System.out.println("Sorting Elements");
for(int i=n-1;i>=0;i--)
{
System.out.println(num[i]);
}
System.out.println(" ");
}
}
