#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  half_sort(n,arr);
	return 0;
}
void half_sort(int n,int arr[])
{
  
  for(int i=0;i<=(n/2)-2;i++)
  {
    for(int j=0;j<=(n/2)-2-i;j++)
    {
      if(arr[j]>arr[j+1])
      {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
  
  for(int i=(n/2);i<=n-2;i++)
  {
    for(int j=(n/2);j<=n-2;j++)
    {
      if(arr[j]<arr[j+1])
      {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
  for(int i=0;i<n;i++)
    printf("%d ",arr[i]);
}