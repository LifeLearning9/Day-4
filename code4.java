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
          while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))  //odd length
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
          while(p>=0 && q<s.length() && s.charAt(p)==s.charAt(q))   //even length
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
