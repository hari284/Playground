#include<stdio.h>
int main()
{
    int arr_size,c=0;
    scanf("%d", &arr_size);
    int arr[arr_size];
    for(int index = 0; index < arr_size; index++)
    {
        scanf("%d", &arr[index]);
    }
    int seq[2 * arr_size];
    int seq_idx = 0;
    int start_idx = 0;


    for(int index = 0 ; index < arr_size-1; index++)
    {
        if(arr[index] > arr[index + 1])
        {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = index;
            seq_idx++;
            start_idx = index + 1;
        }
    }
       
    if(start_idx != arr_size-1)
    {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = arr_size - 1;
            seq_idx++;
    }
       
    if(start_idx == arr_size - 1)
    {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = arr_size - 1;
            seq_idx++;
    }
       
    for(int index = 0; index <= (seq_idx-1); index = index + 2)
    {
        start_idx = seq[index];
        int end_idx = seq[index + 1];
      int sum=0;
        for (int idx = start_idx ; idx <= end_idx; idx++)
        {
           sum += arr[idx];
        }
     // c=sum;
      if(sum>c)
        c=sum;
       
       }
   printf("%d",c);
   return 0;
}