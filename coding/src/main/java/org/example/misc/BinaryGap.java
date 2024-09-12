package org.example.misc;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(binaryGap(32));
    }

    public static int binaryGap(int N){
        String str = Integer.toBinaryString(N);
        int left = 0;
        int right = 0;
        int max = 0;
        int last = str.lastIndexOf('1');

        while(right < last){
            if(str.charAt(right) == '0')
                right++;
            else {
                left = right;
                right++;
            }
            max = Math.max(max, right - left - 1);
        }
        return max;
    }
}
