#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  // Type your code here
  int a=0,flag=0,k,l;
  for(int i=0;i<size;i++)
  {l=i;
    
    for(int j=0;j<size;j++)
    {a = arr[i];
       a=a+arr[j];
      k=j;
      if(a==sum)
      {
        flag=1;//printf("Perfect couple: %d %d",arr[i],arr[j]);
        break;
      }
      else
        flag=0;
    }
    if(flag==1)
      break;//printf("Perfect couple: %d %d",arr[i],arr[k]);
    //else
      //printf("No Perfect couple found");
  }
  if(flag==1)
    printf("Perfect couple: %d %d",arr[l],arr[k]);
  else
    printf("No perfect couple found!");
}