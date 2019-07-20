#include <stdio.h>
int main() 
{
    int n,flag=0;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
  for(int i=0;i<n;i++)
  {flag=0;
    for(int j=i+1;j<n;j++)
    {
      if(arr[i]<arr[j])
      {
        flag=1;
        break;
      }
      //if(i==n-1)
        //flag=2;
    }
    if(flag==0)
      printf("%d ",arr[i]);
  }
    return 0;
}