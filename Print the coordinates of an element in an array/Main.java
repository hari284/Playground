#include<stdio.h>
int main()
{
  int r,c,s,flag=0;
  scanf("%d ",&r);
   scanf("%d",&c);
  int a[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d ",&a[i][j]);
    }
    //printf('\n');
  }
  int i=0,j=0;
  scanf("%d",&s);
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(s==a[i][j])
      {flag=1;
       printf("(%d, %d)",i,j);
        break;
      }
    }
   // printf('\n');
  }
  if(flag==0)
   printf("(-1, -1)");

    
  return 0;
}