#include <stdio.h>
int main() {
	//Type your code
  int x,second_digit;
  scanf("%d",&x);
  while(x>0)
  {
    if(x>=100)
      x=x/10;
   else
   {
     second_digit = x%10;
     break;
   }
    
  }
  printf("%d",second_digit);
  return 0;
}