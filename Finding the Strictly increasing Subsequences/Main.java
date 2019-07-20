#include<stdio.h>
int main()
{
	int arr_size;
    scanf("%d", &arr_size);
    int arr[arr_size];
    for(int index = 0; index < arr_size; index++)
    {
       scanf("%d", &arr[index]);
    }
  inc_subseq(arr_size,arr);
	return 0;
}
void inc_subseq(int arr_size,int arr[])
{int curr=0;
  for(int i=0;i<arr_size;i++)
  { curr=0;
    for(int j=i+1;j<arr_size;j++)
    {
      if(arr[i]<arr[j] && curr<=arr[j])
      {
        printf("%d,",arr[i]);
        printf("%d\n",arr[j]);
        curr = arr[j];
      }
    }
  }
  //return 0;
}