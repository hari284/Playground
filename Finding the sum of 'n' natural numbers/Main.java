#include <stdio.h>
long int sumofNumbers(int n);
int main()
{
   int n;
    //printf("Enter a positive integer: ");
    scanf("%d", &n);
    printf("%d",sumofNumbers(n));
  
  return 0;
}
long int sumofNumbers(int n)
{
  if(n>0)
     return n+sumofNumbers(n-1);
}