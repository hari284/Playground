#include<stdio.h>
int main()
{
  //Type your code here
  int n,count=1;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i] == 1 && arr[i+1] == 1)
    {
      count ++;
      
    }
    else
      break;
  }
  printf("%d",count);
  return 0;
}