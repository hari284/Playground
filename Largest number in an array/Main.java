#include<stdio.h>
int main()
{
  //fill the code
  int size;
  scanf("%d\n",&size);
  int arr[size];
  for(int i =0;i<size;i++)
    scanf("%d ",&arr[i]);
  int max = arr[0];
  for(int i =0;i<size;i++)
  {
    if(arr[i]>max)
      max=arr[i];
  }
  printf("%d",max);
  
  return 0;
}