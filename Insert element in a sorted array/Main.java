#include<stdio.h>
int main()
{
 int n,ele;
  scanf("%d",&n);
  int arr[n+1];
  for(int i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
  int ind=0;
  scanf("%d",&ele);
 for(int i=0;i<n;i++)
 {
   if(ele<arr[i])
   {
     ind=i;
     break;
   }
   else
     ind=n;
 }
  for(int i=n;i>=ind;i--)
  {
   if(i==ind)
   {
      arr[i]=ele;
     break;
   }
   else
   {
      arr[i]=arr[i-1];
   }
    
  }
  for(int i=0;i<n+1;i++)
    printf("%d ",arr[i]);
  return 0;
}