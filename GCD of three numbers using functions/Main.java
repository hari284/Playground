#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int m = gcd_two(n1,n2);
  int gcd = gcd_two(n3,m);
  printf("%d",gcd);
  	return 0;
}
int gcd_two(int x,int y)
{
  int min = 0;
  if(x<y)
    min = x;
  else
    min = y;
  while(min>0)
  {
    if(x%min == 0 && y%min == 0)
      return min;
    else
      --min;
  }
}
