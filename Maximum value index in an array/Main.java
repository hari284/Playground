// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n,index;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  int max = arr[0];
  for(int j=0;j<n;j++)
  {
    if(max < arr[j])
      index = j;
  }
  printf("%d",index);
  
   return 0;
}