#include<stdio.h>
#include<malloc.h>
//#include<string.h>
#define size 20
int *arr;
int top;
void init()
{
  arr = malloc(size*sizeof(int));
  top=-1;
}
void push(int a)
{
  arr[++top]=a;
}
int pop()
{
  return arr[top--];
}
void print()
{
  int i;
  for(i=0;i<=top;i++)
    printf("%d ",arr[i]);
  printf("\n");
}
void destroy()
{
  free(arr);
}
int main() {
 int n;
    int x, i;
    char command[10];
    scanf("%d", &n);
    init();
    for (i = 0; i < n; i++) {
        scanf("%s", command);
        if (strcmp(command, "push") == 0) {
            scanf("%d", &x);
            push(x);
        } else if (strcmp(command, "pop") == 0) {
            printf("%d\n", pop());
        } else {
            print();
        }
    }
    destroy();
    return 0;

}