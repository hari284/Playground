#include <stdio.h>
int main() {
	//Type your code
  int num,fact=1;
  scanf("%d",&num);
  while(num!=0)
  {
    fact = fact*num;
    --num;
  }
  printf("%d",fact);
	return 0;
}