package test;

import java.util.*;

 

public class posl1

{

  static int x[], y[], dp[][];

  static int n, m;


  public static void main(String[] args)

  {

    Scanner con = new Scanner(System.in);

    n = con.nextInt();

    x = new int[n+1];

    for(int i = 1; i <= n; i++)

      x[i] = con.nextInt();

     

    m = con.nextInt();

    y = new int[m+1];

    for(int i = 1; i <= m; i++)

      y[i] = con.nextInt();

     

    dp = new int[2][m+1];

 

    for(int i = 1; i <= n; i++)

    for(int j = 1; j <= m; j++)

      if (x[i] == y[j])

        dp[i%2][j] = 1 + dp[(i-1)%2][j-1];

      else

        dp[i%2][j] = Math.max(dp[(i-1)%2][j],dp[i%2][j-1]);

 

    System.out.println(dp[n%2][m]);

    con.close();

  }

}