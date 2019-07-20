#include <stdio.h>
int main() {
	//Type your code
  int y,second_digit,sum,last_digit;
  scanf("%d",&y);
  int x=y;
  while(x>0)
  {
    if(x>=10)
      x=x/10;
   else
   {
     second_digit = x%10;
     break;
   }
    
  }
  last_digit = y%10;
  sum = last_digit + second_digit;
  printf("%d",sum);
  return 0;
}