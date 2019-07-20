#include <stdio.h>
int main() 
{
	int n,m;
  scanf("%d\n",&n);
  scanf("%d\n",&m);
  int arr1[n],arr2[m],arr3[n+m],arr4[m+n];
  for(int i=0;i<n;i++)
    scanf("%d\n",&arr1[i]);
  for(int i=0;i<m;i++)
    scanf("%d\n",&arr2[i]);
  int k=0;
for(int i=0;i<n;i++)
{
  arr3[k++]=arr1[i];
}
for(int i=0;i<m;i++)
{
  arr3[k++]=arr2[i];
}
  int temp=0;
  for (int i = 0; i < k; i++)
    {
        for (int j = 0; j <(k - i - 1); j++)
        {
            if (arr3[j] > arr3[j + 1])
            {
                temp = arr3[j];
                arr3[j] = arr3[j + 1];
                arr3[j + 1] = temp;
            }
        }
    }
  for(int i=0;i<k;i++)
    printf("%d ",arr3[i]);
	return 0;
}