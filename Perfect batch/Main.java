/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n],sum[n/3];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  
  for(int i=0;i<n/3;i++)
  {
    for(int j=0;j<3;j++)
      sum[i] += arr[j];
  }
  //int max = size[0];
  int flag=0;
  for(int i=0;i<n/3;i++)
  {
    if(sum[0]!=sum[i])
    {
        flag=0;
      break;
    }
    else
    {
      flag=1;
      //break;
    }
  }
  if(flag==1)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}