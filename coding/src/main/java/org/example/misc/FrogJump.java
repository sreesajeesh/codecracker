package org.example.misc;

public class FrogJump {

    public static void main(String[] args) {
        System.out.println(noOfJumps(10, 85, 30));
    }

    public static int noOfJumps(int X, int Y, int D){
        if(X >= Y)
            return 0;
        if(Y - X < D)
            return 1;
        int k = Y - X;
        if(k <= D)
            return 1;
        int m = k/D;
        if(k%D != 0)
            return m + 1;
        return m;
    }

    public static int GCD(int x, int y)
    {
        if (y == 0)
            return x;
        return GCD(y, x % y);
    }
}



/*
A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
 */