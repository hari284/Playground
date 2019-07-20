#include<stdio.h>
int main()
{
  //Type your code here
  int x=0,y=0;
  scanf("%d",&x);
  y=x/100;
  x=x%10;
  printf("%d",x+y);
  return 0;
}