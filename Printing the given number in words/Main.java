#include<stdio.h>
int main()
{
  //Type your code here
  int x;
  scanf("%d",&x);
  switch(x)
  {
    case 1:
      printf("One");
      break;
    case 2:
      printf("Two");
      break;
    case 3:
      printf("Three");
      break;
    case 4:
      printf("Four");
      break; 
    case 5:
      printf("Five");
      break;  
    default:
      printf("Invalid");
  }
  return 0;
}