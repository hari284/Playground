#include<stdio.h>
int main()
{ 
  int r;
  int c;
  scanf("%d", &r);
  scanf("%d", &c);
  int matrix[r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", &matrix[i][j]);
   }
   
  }
   
  int transpose[c][r];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    transpose[j][i] = matrix[i][j]; 
   }
  }
   
  for(int i = 0; i < c; i++)
  {
   for(int j = 0; j < r; j++)
   {
    printf("%d ", transpose[i][j]);
   }
   printf("\n");
  }
}