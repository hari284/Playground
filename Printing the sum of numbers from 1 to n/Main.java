#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0;
  scanf("%d",&n);
  for(int i = 1;i<=n;i=i+1)
  {
    sum+=i;
    
  }
  printf("%d\n",sum);
	return 0;
}