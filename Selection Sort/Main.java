#include<stdio.h>
int main()
{
  int n,min;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
  for(int i=0;i<n;i++)
  {
    min = i;
    for(int j=i+1;j<n;j++)
    {
      if(arr[j]<arr[min])
        min=j;
    }
    int temp = arr[min];
    arr[min] = arr[i];
    arr[i] = temp;
  }
  for(int i=0;i<n;i++)
  {
    printf("%d\n",arr[i]);
  } 
  return 0;
}