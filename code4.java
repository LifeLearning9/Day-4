import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String res="";
       int maxlen=0;
      for(int i=0;i<s.length();i++)
      {
          int l=i,r=i;
          while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))  //odd length palindromes calculating a, aba,abcba likethat.. in given string 
          {
              int len=r-l+1;
              if(maxlen<len)
              {
                  maxlen=len;
                  res=s.substring(l,r+1);
              }
              l--;
              r++;
          }
          int p=i,q=i+1;
          while(p>=0 && q<s.length() && s.charAt(p)==s.charAt(q))   //even length plaindromes calculating aa,abba,abbbba etc in given string
          {
              int len=q-p+1;
              if(maxlen<len)
              {
                  maxlen=len;
                  res=s.substring(p,q+1);
              }
              p--;
              q++;
          }
      }
      System.out.println(res);
    }
}
