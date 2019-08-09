#include <iostream>
#include <string>

using namespace std;
int main()
{
   string raptor_prompt_variable_zzyz;
   ?? b;
   ?? c;
   ?? average;
   ?? cp;
   ?? sum;
   ?? i;
   ?? j;

   raptor_prompt_variable_zzyz ="enter lower bound";
   cout << raptor_prompt_variable_zzyz << endl;
   cin >> i;
   raptor_prompt_variable_zzyz ="enter ub";
   cout << raptor_prompt_variable_zzyz << endl;
   cin >> b;
   sum =0;
   cp =0;
   while (1)
   {
      c =0;
      if (i>b)) break;
      j =1;
      while (!(j==i))
      {
         if (i % j==0)
         {
            c =c+1;
         }
         else
         {
         }
         j =j+1;
      }
      if (c>=2)
      {
      }
      else
      {
         cout << i << endl;         sum =sum+i;
         cp =cp+1;
      }
      i =i+1;
   }
   average =0;
   cout << "average="+(sum/cp) << endl;
   return 0;
}
