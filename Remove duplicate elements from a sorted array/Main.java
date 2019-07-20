#include <stdio.h>
int main() 
{
   int n,flag=0,k=0;
  scanf("%d",&n);
  int arr[n],arr2[k];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  for(int i=0;i<n;i++)
  { flag=0;
    for(int j=0;j<n;j++)
    {
     if(arr[i]==arr[j] && i>j)
      {
        flag=2;
        break;
      } 
      if(arr[i]==arr[j] && i!=j)
      {
        flag=1;
        break;
      }
    }
    if(flag==1 || flag==0)
       arr2[k++]=arr[i];
  }
  //int i=0;
  for(int i=0;i<k;i++){
    printf("%d ",arr2[i]);
    }
	return 0;
}