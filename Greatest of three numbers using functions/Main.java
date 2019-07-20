#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int m = great_two(n1,n2);
  great_three(n3,m);
  	return 0;
}
int great_two(int x,int y)
{
  if(x>y)
    return x;
  else
    return y;
}
void great_three(int x,int y)
{
  x>y?printf("%d",x):printf("%d",y);
}