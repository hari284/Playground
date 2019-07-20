#include<stdio.h>
void display_the_matrix(int row_size, int col_size, int matrix[row_size][col_size]);

void substraction_of_2_matrices(int row_size, int col_size, int matrix1[row_size][col_size], int matrix2[row_size][col_size], int sum[row_size][col_size]);

int main()
{
  int row_size;
  int column_size;
  scanf("%d", &row_size);
  scanf("%d", &column_size);
  int matrix1[row_size][column_size];
  for(int i = 0; i < row_size; i++){
   for(int j = 0; j < column_size; j++)
   {
    scanf("%d", &matrix1[i][j]);
   }
  }
  int matrix2[row_size][column_size];
  for(int i = 0; i < row_size; i++){
   for(int j = 0; j < column_size; j++)
   {
    scanf("%d", &matrix2[i][j]);
   }
  }
  int sum[row_size][column_size];
  substraction_of_2_matrices(row_size, column_size, matrix1, matrix2, sum);
  display_the_matrix(row_size, column_size, sum);
}

void substraction_of_2_matrices(int row_size, int col_size, int matrix1[row_size][col_size], int matrix2[row_size][col_size], int sum[row_size][col_size])
{
  for(int i = 0; i <= row_size; i++)
  {
   for(int j = 0; j <= col_size - 1; j++)
   {
    sum[i][j] = matrix1[i][j] - matrix2[i][j];
   }
  }
}

void display_the_matrix(int row_size, int col_size, int matrix[row_size][col_size])
{
  for(int i = 0; i <= row_size - 1; i++)
  {
   for(int j = 0; j <= col_size - 1; j++)
   {
    printf("%d ",matrix[i][j]);
   }
   printf("\n");
  }
}
 
