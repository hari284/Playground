// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>
// Main function
int main()
{
  char str1[1000];
 gets(str1);
 //char str2[1000];
 //gets(str2);
 int string1_len = strlen(str1);
 //int string2_len = strlen(str2);
 int stat[26];
  
 for (int idx = 0; idx <= 25; idx++)
 {
   stat[idx] = 0;
 }
  
 for (int idx = 0; idx < string1_len; idx++)
 {
   if(str1[idx] >= 'a' && str1[idx] <= 'z')
   {
     int offset = str1[idx] - 'a';
     stat[offset]++;
   }
    
   else if(str1[idx] >= 'A' && str1[idx] <= 'Z')
   {
     int offset = str1[idx] - 'A';
     stat[offset]++;
   }
 }
  for(int i=0;i<26;i++)
  {
    if(stat[i]<1)
    {
      printf("%c ",i+97);
    }
  }
   return 0;
}