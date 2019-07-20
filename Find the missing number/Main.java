#include<stdio.h>
int main()
{
  //Type your code here
  int n,flag;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d\n",&arr[i]);
  for(int i=1;i<=n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(arr[j] == i)
      {
        flag=1;
        break;
      }
      else
        flag=0;
    }
    if(flag == 0)
      printf("%d",i);
  }
  return 0;
}