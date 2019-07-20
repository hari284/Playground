#include<stdio.h>
int main()
{
  //Type your code here
  int size;
  scanf("%d\n",&size);
  int arr[size];
  for(int i =0;i<size;i++)
    scanf("%d ",&arr[i]);
  int s1,s2,s1_index,s2_index;
  scanf("%d\n%d\n",&s1,&s2);
  for(int i=0;i<size;i++)
  {
    if(s1==arr[i])
    {
      s1_index = i;
      break;
    }
    else
      s1_index = -1;
  }
  for(int i=0;i<size;i++)
  {
    if(s2==arr[i])
    {
      s2_index = i;
      break;
    }
    else
      s2_index = -1;
  }
  printf("%d\n%d",s1_index,s2_index);
  return 0;
}