package nl.rug.assertions;

public class App {

    public static void main(String[] args) {

        System.out.println(sum(1,3));
    }


    // int n and m should be a positive value here
    private static int sum(int n, int m) {

        assert n >=0 && m >= 0;

        // pre: n and m are positive
       int result = n+m;


       // post: result >= n + m

        assert result >= n+m;

       return result;
    }
}
