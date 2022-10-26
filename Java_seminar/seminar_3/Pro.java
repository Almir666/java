package Java_seminar.seminar_3;

public class Pro {

    static int solve(int s, int e, int p, int m) {
      int[] ways = new int[e + p];
      ways[s] = 1;
  
      for (int i = s + p; i <= e; i++) {
        ways[i] = i % m == 0 ? ways[i - p] + ways[i / m] : ways[i - p];
      }
  
      for (int i = 0; i < ways.length; i++) {
        System.out.printf(ways[i] + "  ");
      }
      return ways[e];
    }
  
    static int f(int s, int e, int p, int m) {
  
      // return e == s ? 1
      // : e % m == 0 ? f(s, e - p, p, m) + f(s, e / m, p, m)
      // : f(s, e - p, p, m);
      if (e == s)
        return 1;
      else if (e % m == 0)
        return f(s, e - p, p, m) + f(s, e / m, p, m);
      else
        return f(s, e - p, p, m);
    }
  
    public static void main(String[] args) {
  
      int a = 1;
      int b = 2;
      int max;
  
      if (a > b)
        max = a;
      else
        max = b;
  
      max = a > b ? a : b;
  
      // solve(2, 110, 1, 2);
      // System.out.println(f(2, 110, 1, 2));
  
      f1(2, 11, 1, 2);
    }
  
    // f(s,e)=> {
    // |if(i%2==0)=>return ways[i-1]+ways[i/2]
    // | if(i % 2 != 0) => return ways[i-1]
  
    static int f1(int s, int e, int p, int m) {
      int[] ways = new int[e + 1];
      ways[s] = 1;
  
      for (int i = s + 1; i <= e; i++) {
  
        ways[i] = i % m == 0
            ? ways[i - p] + ways[i / m]
            : ways[i - p];
      }
      // for (int i = s + 1; i <= e; i++) {
      // if (i % m == 0)
      // ways[i] = ways[i - p] + ways[i / m];
      // else
      // ways[i] = ways[i - p];
      for (int i = 0; i < ways.length; i++) {
        System.out.printf(ways[i] + "  ");
      }
      System.out.println();
      return ways[e];
    }
  
  }
  