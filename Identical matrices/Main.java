#include<stdio.h>
int main()
{int flag=0;
	int r1;
    int c1;
    scanf("%d", &r1);
    scanf("%d", &c1);
    int a[r1][c1];
    
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    
    
    int b[r1][c1];
    
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
            scanf("%d", &b[i][j]);
        }
    }

 
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
        {
          if(a[i][j]==b[i][j])
          {
            flag=1;
          }
          else
          {
            flag=0;
            break;
          }
        }
      }
      

 if(flag==1)
     printf("Yes");
 else
     printf("No");
 return 0;
}