#include <stdio.h>
int main() {
	//Type your code
  int x;
  scanf("%d",&x);
  int sum = 0;
  while(x>0)
  {
    int m = x%10;
      
    x = x/10;
    
    sum = sum + m;
  }
  printf("%d",sum);
	return 0;
}