#include <stdio.h>
int main(){
	// Type your code here
  int x;
  scanf("%d",&x);
  for(int i=1;i<=x;i++)
  {
    for(int j=1;j<=x;j++)
      printf("%d",i);
     printf("\n");
  }
  	return 0;
}