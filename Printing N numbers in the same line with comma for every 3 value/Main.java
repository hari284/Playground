#include <stdio.h>
int main() {
	//Type your code
   int x;
  scanf("%d",&x);
  for(int i=1;i<=x;i++)
  {
    printf("%d",i);
    if(i%3==0 )
      printf(",");
  }
	return 0;
}